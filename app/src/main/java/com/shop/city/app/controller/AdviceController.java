package com.shop.city.app.controller;

import com.shop.city.common.bean.CommonException;
import com.shop.city.common.bean.CommonExceptionEnum;
import com.shop.city.common.bean.RestResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@ControllerAdvice
public class AdviceController {

    private static final Logger logger = LoggerFactory.getLogger(AdviceController.class);

    public RestResult exception(Exception exception, HttpServletRequest request, HttpServletResponse response){
        if (exception instanceof OAuthProblemException || exception instanceof OAuthSystemException){
            logger.warn("OAuthException", exception.getMessage());
            return RestResult.LOGIN().build();
        }else if(exception instanceof org.springframework.validation.BindException || exception instanceof org.springframework.web.bind.MethodArgumentNotValidException){
            //参数校验异常
            logger.warn("BindException", exception.getMessage());
            BindingResult bindingResult = null;
            if (exception instanceof org.springframework.validation.BindException) {
                bindingResult = ((BindException) exception).getBindingResult();
            } else {
                bindingResult = ((MethodArgumentNotValidException) exception).getBindingResult();
            }
            if (bindingResult != null && bindingResult.hasErrors()) {
                List<FieldError> list = bindingResult.getFieldErrors();
                if (list != null && list.size() > 0) {
                    FieldError fieldError = list.get(0);
                    return RestResult.ERROR_PARAMS().message(fieldError.getDefaultMessage()).build();
                }
            }
            return RestResult.ERROR_SERVER().message("参数校验失败").build();
        }else if (exception instanceof CommonException){
            CommonExceptionEnum resultCode =  ((CommonException) exception).getResultCode();
            if (CommonExceptionEnum.AUTHORITY_DENIED.equals(resultCode)) {
                return RestResult.FORBIDDEN().build();
            }
            logger.error("============业务异常=========", exception);
            // return RestResult.ERROR_SERVER().message(exception.getMessage()).build();
            String message = StringUtils.isBlank(exception.getMessage()) ? resultCode.getMessage() : exception.getMessage();
            return RestResult.builder().code(resultCode.getValue()).message(message).build();
        }else {
            logger.error("Catch All Exception", exception);
        }
        return RestResult.ERROR_SERVER().message("服务器正忙，请稍后在试").build();
    }

//    @ModelAttribute(Constants.KEY_REQ_EMPLOYEE_ID)
//    public Long getEmployeeId(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        if (requestURI.startsWith("/admin")) {
//            String attribute = (String) request.getAttribute(Constants.KEY_REQ_EMPLOYEE_ID);
//            if (StringUtils.isNotBlank(attribute)) {
//                return Long.valueOf(attribute);
//            }
//        }
//        return null;
//    }
//
//    @ModelAttribute(Constants.KEY_REQ_EMPLOYEE_NAME)
//    public String getEmployeeName(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        if (requestURI.startsWith("/admin")) {
//            return (String) request.getAttribute(Constants.KEY_REQ_EMPLOYEE_NAME);    // 这个是姓名 不是账号 员工姓名可以不是真实姓名 即employee_name这个字段
//        }
//        return null;
//    }
//
//    @ModelAttribute(Constants.KEY_REQ_STORE_ID)
//    public Long getStoreId(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        if (requestURI.startsWith("/admin")) {
//            String attribute = (String) request.getAttribute(Constants.KEY_REQ_STORE_ID);
//            if (StringUtils.isNotBlank(attribute)) {
//                return Long.valueOf(attribute);
//            }
//        }
//        return null;
//    }
//
//    @ModelAttribute(Constants.KEY_REQ_USER_ID)
//    public Long getUserId(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        if (requestURI.startsWith("/api")) {
//            String attribute = (String) request.getAttribute(Constants.KEY_REQ_USER_ID);
//            if (StringUtils.isNotBlank(attribute)) {
//                return Long.valueOf(attribute);
//            }
//        }
//        return null;
//    }
//
//    @ModelAttribute(Constants.XCX_KEY_REQ_STORE_ID)
//    public Long getXCXStoreId(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        String storeId = null;
//        if (requestURI.startsWith("/api")) {
//            storeId = request.getHeader("storeId");
//            if (StringUtils.isBlank(storeId)) {
//                storeId =request.getParameter("storeId");
//                if (StringUtils.isBlank(storeId)) {
//                    storeId = (String)request.getAttribute("storeId");
//                }
//            }
//        }
//        return storeId == null ? null : Long.valueOf(storeId);
//    }
//
//    @ModelAttribute("ip")
//    public String getIp(HttpServletRequest request) {
//        String ip = request.getHeader("x-forwarded-for");
//        if (StringUtils.isBlank(ip) || StringUtils.equalsIgnoreCase("unknown", ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (StringUtils.isBlank(ip) || StringUtils.equalsIgnoreCase("unknown", ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (StringUtils.isBlank(ip) || StringUtils.equalsIgnoreCase("unknown", ip)) {
//            ip = request.getRemoteAddr();
//        }
//        if (StringUtils.isBlank(ip)) {
//            ip = "0.0.0.0";
//        }
//        return ip;
//    }
}

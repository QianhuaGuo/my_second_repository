package com.shop.city.common.bean;

public enum CommonExceptionEnum {

    /** 操作成功 */
    SUCCESS(200, "操作成功"),

    /** 系统错误 */
    SYSTEM_FAILURE(500, "系统错误"),

    /** 参数为空 */
    NULL_ARGUMENT(400, "参数为空"),

    /** 参数不正确 */
    ILLEGAL_ARGUMENT(400, "参数不正确"),

    /** 页面未找到 */
    NOT_FOUND(404, "页面未找到"),

    /** 没有权限 **/
    AUTHORITY_DENIED(401, "访问拒绝"),

    /** 会话超时 */
    SESSION_TIMEOUT(401, "会话超时"),

    OFFLINE_PHONE_NULL(4000, "请输入手机号码"),
    OFFLINE_PHONE_ERROR(4001, "号码格式错误"),
    OFFLINE_PHONE_USING(4002, "手机号码已被使用"),
    OFFLINE_SMS_CODE_NULL(4003, "请输入验证码"),
    OFFLINE_SMS_CODE_ERROR(4004, "验证码错误"),
    OFFLINE_INVITE_CODE_NULL(4005, "请输入邀请码"),
    OFFLINE_INVITE_CODE_NOT_FOUND(4006, "邀请码不存在"),
    OFFLINE_INVITE_CODE_ERROR(4007, "邀请码已失效"),
    OFFLINE_ACTIVITY_NOT_FOUND(4008, "申请的线下活动不存在"),
    OFFLINE_ACTIVITY_FINISH(4009, "申请的线下活动已结束"),
    OFFLINE_ENTRANCE_CODE_IS_NULL(4010, "入场码为空"),
    OFFLINE_ENTRANCE_CODE_ERROR(4011, "入场码错误"),
    OFFLINE_ENTRANCE_CODE_NOT_FOUND(4012, "入场码不存在"),
    OFFLINE_ENTRANCE_CODE_IS_SIGN(4013, "已入场"),
    OFFLINE_ENTRANCE_CODE_IS_NOT_SIGN(4014, "未入场"),
    OFFLINE_USER_INFO_ERROR(4400, "线下活动用户信息错误");

    /** 枚举值 */
    private int value;

    /** 枚举信息 */
    private String message;

    private CommonExceptionEnum(int value, String message) {
        this.value = value;
        this.message = message;
    }

    /**
     * 根据枚举值获取枚举对象，如果找不到对应的枚举返回<code>null</code>
     *
     * @param value 枚举值
     * @return 枚举对象
     */
    public static CommonExceptionEnum getEnumByValue(int value) {
        for (CommonExceptionEnum resultCode : CommonExceptionEnum.values()) {
            if (resultCode.getValue()==value) {
                return resultCode;
            }
        }
        return null;
    }

    /*
     * getter
     */
    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}

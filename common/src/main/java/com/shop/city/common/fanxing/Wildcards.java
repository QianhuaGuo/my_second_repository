package com.shop.city.common.fanxing;

public class Wildcards {
    //原始参数
    static void rawArgs(Holder holder,Object arg){
//        holder.set(arg);//Warning:Unchecked call to set(T) as a member of the raw type holder
//        holder.set(new Wildcards());//同上

//        T t = holder.get();//can't do this don't have any 'T'

       Object obj =  holder.get();//ok but type information has been lost
    }

    //similar to rawArgs(),but errors instead of warnings
    static void unboundArg(Holder<?> holder,Object arg){
//        holder.set(arg);//Error:set(capture of ?) in Holder<capture of ?> cannot be applied to (Object)
//        holder.set(new Wildcards());//同上

//       T t =  holder.get();//can't do this ; don't have any 'T'

        //ok but type information has been lost;
        Object obj = holder.get();
    }

    static <T> T excat1(Holder<T> holder){
        T t = holder.get();
        return t;
    }

    static <T> T excat2(Holder<T> holder,T arg){
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T  wildSubtype(Holder<? extends T> holder,T arg){
//        holder.set(arg);//Error:set(capture of ? extends T)in Holder<capture of ? extends T> cannot be applied to (T)
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder,T arg){
        holder.set(arg);
//        T t = holder.get();//Error

        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        //Or
        raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();

        Long lng = 1L;

        rawArgs(raw,lng);
        rawArgs(qualified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);

        unboundArg(raw,lng);
        unboundArg(qualified,lng);
        unboundArg(unbounded,lng);
        unboundArg(bounded,lng);

        Object r1 = excat1(raw);//Warnings
        Long r2 = excat1(qualified);
        Object r3 = excat1(unbounded);//must return Object
        Long r4 = excat1(bounded);


        Long r5 = excat2(raw,lng);//Warnings
        Long r6 = excat2(qualified,lng);
//        Long r7 = excat2(unbounded,lng);//Error
//        Long r8 = excat2(bounded,lng);//Error
       Long r9 = wildSubtype(raw,lng);//Warnings
       Long r10 = wildSubtype(qualified,lng);
       Object r11 = wildSubtype(unbounded,lng);//only return Object
        Long r12 = wildSubtype(bounded,lng);

        wildSupertype(raw,lng);//Warnings
        wildSupertype(qualified,lng);
//        wildSupertype(unbounded,lng);//Error
//        wildSupertype(bounded,lng);//Error
    }
}

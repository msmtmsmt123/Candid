/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
public final class ary {
    public static <T> apj<T> a(final apj<? super T> apj2) {
        return new apj<T>(apj2){

            @Override
            public void onCompleted() {
                apj2.onCompleted();
            }

            @Override
            public void onError(Throwable throwable) {
                apj2.onError(throwable);
            }

            @Override
            public void onNext(T t2) {
                apj2.onNext(t2);
            }
        };
    }

}


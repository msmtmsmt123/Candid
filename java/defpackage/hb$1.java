package defpackage;

/* compiled from: ActivityAdapter */
class hb$1 implements px<String, nz> {
    final /* synthetic */ ja a;
    final /* synthetic */ hb b;

    hb$1(hb this$0, ja jaVar) {
        this.b = this$0;
        this.a = jaVar;
    }

    public /* synthetic */ boolean onException(Exception exception, Object obj, qq qqVar, boolean z) {
        return a(exception, (String) obj, qqVar, z);
    }

    public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, qq qqVar, boolean z, boolean z2) {
        return a((nz) obj, (String) obj2, qqVar, z, z2);
    }

    public boolean a(Exception e, String model, qq<nz> qqVar, boolean isFirstResource) {
        return false;
    }

    public boolean a(nz resource, String model, qq<nz> qqVar, boolean isFromMemoryCache, boolean isFirstResource) {
        this.a.c.setBackground(null);
        return false;
    }
}

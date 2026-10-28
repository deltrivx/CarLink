package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f15398a;

    public i(j jVar) {
        this.f15398a = jVar;
    }

    @Override // z.d1
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        j jVar = this.f15398a;
        float fFloatValue = ((Number) jVar.f15408a.invoke(Float.valueOf(f10))).floatValue();
        jVar.f15412e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        jVar.f15413f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

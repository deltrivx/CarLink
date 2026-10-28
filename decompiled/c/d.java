package c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4.l f1707b;

    public /* synthetic */ d(p4.l lVar, int i7) {
        this.f1706a = i7;
        this.f1707b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1706a) {
            case 0:
                this.f1707b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e7) {
                    if (!i9.l.a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e7;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!i9.l.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}

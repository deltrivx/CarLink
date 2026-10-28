package p4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n4.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10175c;

    public h(i iVar) {
        super(3);
        this.f10175c = iVar;
    }

    @Override // n4.h
    public final View U(int i7) {
        i iVar = this.f10175c;
        iVar.getClass();
        throw new IllegalStateException("Fragment " + iVar + " does not have a view");
    }

    @Override // n4.h
    public final boolean V() {
        this.f10175c.getClass();
        return false;
    }
}

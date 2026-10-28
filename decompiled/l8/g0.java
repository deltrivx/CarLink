package l8;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f8159c;

    public /* synthetic */ g0(View view, h9.a aVar, int i7) {
        this.f8157a = i7;
        this.f8158b = view;
        this.f8159c = aVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8157a) {
            case 0:
                this.f8158b.playSoundEffect(0);
                this.f8159c.invoke();
                break;
            default:
                this.f8158b.playSoundEffect(0);
                this.f8159c.invoke();
                break;
        }
        return t8.z.f12851a;
    }
}

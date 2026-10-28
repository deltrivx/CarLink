package e4;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4433e;

    public z(int i7, Class cls, int i10, int i11, int i12) {
        this.f4433e = i12;
        this.f4317a = i7;
        this.f4320d = cls;
        this.f4319c = i10;
        this.f4318b = i11;
    }

    @Override // e4.b0
    public final Object c(View view) {
        switch (this.f4433e) {
            case 0:
                return Boolean.valueOf(g0.c(view));
            case 1:
                return g0.a(view);
            default:
                return Boolean.valueOf(g0.b(view));
        }
    }

    @Override // e4.b0
    public final void d(View view, Object obj) {
        switch (this.f4433e) {
            case 0:
                g0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                g0.e(view, (CharSequence) obj);
                break;
            default:
                g0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // e4.b0
    public final boolean h(Object obj, Object obj2) {
        switch (this.f4433e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}

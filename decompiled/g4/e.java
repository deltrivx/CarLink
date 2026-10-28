package g4;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import e4.l0;
import h9.n;
import p.w;
import p1.l;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5913a;

    public /* synthetic */ e(Object obj) {
        this.f5913a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void a() {
        n nVar = (n) this.f5913a;
        synchronized (l.f10057c) {
            l.f10062h = p.u0(l.f10062h, nVar);
        }
    }

    public boolean b(a2.d dVar, int i7, Bundle bundle) {
        e4.c dVar2;
        w wVar = (w) this.f5913a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((i) dVar.f20b).i();
                Parcelable parcelable = (Parcelable) ((i) dVar.f20b).o();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        i iVar = (i) dVar.f20b;
        ClipData clipData = new ClipData(iVar.a(), new ClipData.Item(iVar.h()));
        if (i10 >= 31) {
            dVar2 = new a2.d(clipData, 2);
        } else {
            e4.d dVar3 = new e4.d(0);
            dVar3.f4327b = clipData;
            dVar3.f4328c = 2;
            dVar2 = dVar3;
        }
        dVar2.c(iVar.j());
        dVar2.setExtras(bundle);
        return l0.h(wVar, dVar2.build()) == null;
    }
}

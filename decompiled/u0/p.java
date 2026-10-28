package u0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b3.q0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import g3.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l0.o0;
import l0.u0;
import r2.g0;
import r2.r2;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13015b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f13018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1 f13019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r2 f13020g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f13024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f13025m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h9.k f13016c = new o7.q(18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.k f13017d = new o7.q(19);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f13021h = new w("", q0.f1428b, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g3.k f13022i = g3.k.f5865g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f13023j = new ArrayList();
    public final Object k = t8.a.c(t8.i.f12828b, new a5.e(26, this));

    public p(View view, a aVar, k kVar) {
        this.f13014a = view;
        this.f13015b = kVar;
        this.f13025m = new m(aVar, kVar);
    }

    public final q a(EditorInfo editorInfo) {
        int i7;
        int i10;
        w wVar = this.f13021h;
        String str = wVar.f5889a.f1353b;
        long j5 = wVar.f5890b;
        g3.k kVar = this.f13022i;
        int i11 = kVar.f5870e;
        int i12 = kVar.f5869d;
        boolean z10 = kVar.f5866a;
        if (i11 == 1) {
            i7 = z10 ? 6 : 0;
        } else if (i11 == 0) {
            i7 = 1;
        } else if (i11 == 2) {
            i7 = 2;
        } else if (i11 == 6) {
            i7 = 5;
        } else if (i11 == 5) {
            i7 = 7;
        } else if (i11 == 3) {
            i7 = 3;
        } else if (i11 == 4) {
            i7 = 4;
        } else {
            if (i11 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i7;
        if (Build.VERSION.SDK_INT >= 24) {
            i3.b bVar = kVar.f5871f;
            if (i9.l.a(bVar, i3.b.f6613c)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
                Iterator it = bVar.f6614a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i3.a) it.next()).f6612a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = g0.c((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
        }
        if (i12 == 1) {
            i10 = 1;
        } else if (i12 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (i12 == 3) {
            i10 = 2;
        } else if (i12 == 4) {
            i10 = 3;
        } else if (i12 == 5) {
            i10 = 17;
        } else if (i12 == 6) {
            i10 = 33;
        } else if (i12 == 7) {
            i10 = 129;
        } else if (i12 == 8) {
            i10 = 18;
        } else {
            if (i12 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i10 = 8194;
        }
        editorInfo.inputType = i10;
        if (!z10 && (i10 & 1) == 1) {
            editorInfo.inputType = 131072 | i10;
            if (kVar.f5870e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i13 = editorInfo.inputType;
        if ((i13 & 1) == 1) {
            int i14 = kVar.f5867b;
            if (i14 == 1) {
                editorInfo.inputType = i13 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            } else if (i14 == 2) {
                editorInfo.inputType = i13 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            } else if (i14 == 3) {
                editorInfo.inputType = i13 | 16384;
            }
            if (kVar.f5868c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i15 = q0.f1429c;
        editorInfo.initialSelStart = (int) (j5 >> 32);
        editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
        g4.d.a(editorInfo, str);
        editorInfo.imeOptions |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        if (!t0.b.f12725a || i12 == 7 || i12 == 8) {
            g4.d.b(editorInfo, false);
        } else {
            g4.d.b(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(n3.l.J(c3.a.n(), c3.a.A(), c3.a.x(), c3.a.z(), c3.a.B(), c3.a.C(), c3.a.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(u8.l.M0(new Class[]{c3.a.n(), c3.a.A(), c3.a.x(), c3.a.z()}));
        }
        n nVar = o.f13013a;
        if (l4.j.d()) {
            l4.j.a().i(editorInfo);
        }
        q qVar = new q(this.f13021h, new o0(21, this), this.f13022i.f5868c, this.f13018e, this.f13019f, this.f13020g);
        this.f13023j.add(new WeakReference(qVar));
        return qVar;
    }
}

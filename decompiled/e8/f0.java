package e8;

import a8.x1;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ContentObserver implements h2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f4526h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b8.b0 f4530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fc.h0 f4531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f4532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4533g;

    public f0() {
        super(new Handler(Looper.getMainLooper()));
        this.f4527a = "Brightness";
        this.f4528b = "屏幕亮度";
        this.f4529c = g2.f1593a;
        this.f4531e = fc.y.b(0);
        this.f4532f = u8.w.f13122a;
    }

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 9));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4528b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1796344851);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = new f1.h1(30);
                sVar.h0(objK);
            }
            f1.h1 h1Var = (f1.h1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.TRUE);
                sVar.h0(objC);
            }
            f1.b1 b1Var = (f1.b1) objC;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(1434821542, new a8.o(aVar, 11), sVar), null, n1.h.e(1943600356, new x1(kVar, this, b1Var, h1Var, 5), sVar), n1.h.e(2114098518, new d0(z10, this, h1Var, b1Var, 1), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 16);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4533g) {
                n8.a.b().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this);
                this.f4533g = true;
                onChange(true);
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【屏幕亮度】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4527a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4529c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Integer numValueOf;
        Object next;
        Object objPrevious;
        b8.b0 b0Var = null;
        try {
            numValueOf = Integer.valueOf(Settings.System.getInt(n8.a.b().getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            fc.h0 h0Var = this.f4531e;
            h0Var.getClass();
            h0Var.j(null, numValueOf2);
            Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(iIntValue, "【屏幕亮度】当前亮度: "));
            Iterator it = this.f4532f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (iIntValue >= ((b8.b0) next).f1568c);
            b8.b0 b0Var2 = (b8.b0) next;
            if (b0Var2 != null) {
                b0Var = new b8.b0(b0Var2.f1568c, true);
            } else {
                List list = this.f4532f;
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (iIntValue <= ((b8.b0) objPrevious).f1568c);
                b8.b0 b0Var3 = (b8.b0) objPrevious;
                if (b0Var3 != null) {
                    b0Var = new b8.b0(b0Var3.f1568c, false);
                }
            }
            if (b0Var == null || b0Var.equals(this.f4530d)) {
                return;
            }
            d8.v.a(b0Var);
            this.f4530d = b0Var;
        }
    }
}

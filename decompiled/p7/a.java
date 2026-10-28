package p7;

import com.baidu.carlifevehicle.R;
import f1.s;
import h9.n;
import java.io.IOException;
import k0.e;
import n3.l;
import n4.h;
import o2.j;
import org.xmlpull.v1.XmlPullParserException;
import r1.m;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10305b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10306c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10307d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10308e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f10309f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10310g = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10311a;

    public /* synthetic */ a(int i7) {
        this.f10311a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        switch (this.f10311a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("查看", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m("交流反馈", null, sVar2, 6, 2);
                    i2.c.p("点击扫码加群", sVar2, 6);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    i2.c.m("打赏支持", null, sVar3, 6, 2);
                    i2.c.p("喜欢的话可以打赏一下", sVar3, 6);
                }
                break;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    i2.c.m("查看", null, sVar4, 6, 2);
                    i2.c.b(0, sVar4);
                }
                break;
            case 4:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    n3.n.B(l.N(R.drawable.ic_group, sVar5), "点击扫码加群", androidx.compose.foundation.layout.a.c(h.o(m.f11116a, e.a(12)), 0.7f), null, j.f9357b, 0.0f, sVar5, 24624, 104);
                }
                break;
            default:
                s sVar6 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    n3.n.B(l.N(R.drawable.ic_tip, sVar6), "打赏作者", androidx.compose.foundation.layout.a.c(h.o(m.f11116a, e.a(12)), 1.4f), null, j.f9357b, 0.0f, sVar6, 24624, 104);
                }
                break;
        }
        return z.f12851a;
    }
}

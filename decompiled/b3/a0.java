package b3;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1306a;

    public /* synthetic */ a0(int i7) {
        this.f1306a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        j jVar;
        Object objA;
        switch (this.f1306a) {
            case 0:
                h hVar = (h) obj2;
                return n3.l.m(hVar.f1353b, f0.a(hVar.f1352a, f0.f1328a, (o1.a) obj));
            case 1:
                return Integer.valueOf(((m3.l) obj2).f8423a);
            case 2:
                m3.p pVar = (m3.p) obj2;
                return n3.l.m(Float.valueOf(pVar.f8427a), Float.valueOf(pVar.f8428b));
            case 3:
                o1.a aVar = (o1.a) obj;
                m3.q qVar = (m3.q) obj2;
                n3.q qVar2 = new n3.q(qVar.f8430a);
                e0 e0Var = f0.f1343q;
                return n3.l.m(f0.a(qVar2, e0Var, aVar), f0.a(new n3.q(qVar.f8431b), e0Var, aVar));
            case 4:
                return Integer.valueOf(((f3.k) obj2).f5261a);
            case 5:
                m mVar = (m) obj2;
                return n3.l.m(mVar.f1389a, f0.a(mVar.f1390b, f0.f1336i, (o1.a) obj));
            case 6:
                return Float.valueOf(((m3.a) obj2).f8401a);
            case 7:
                o1.a aVar2 = (o1.a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(f0.a((f) list.get(i7), f0.f1329b, aVar2));
                }
                return arrayList;
            case 8:
                q0 q0Var = (q0) obj2;
                return n3.l.m(Integer.valueOf((int) (q0Var.f1430a >> 32)), Integer.valueOf((int) (4294967295L & q0Var.f1430a)));
            case 9:
                o1.a aVar3 = (o1.a) obj;
                y1.k0 k0Var = (y1.k0) obj2;
                return n3.l.m(f0.a(new y1.q(k0Var.f14925a), f0.f1342p, aVar3), f0.a(new x1.b(k0Var.f14926b), f0.f1344r, aVar3), Float.valueOf(k0Var.f14927c));
            case 10:
                n3.q qVar3 = (n3.q) obj2;
                return qVar3 == null ? false : n3.q.a(qVar3.f8755a, n3.q.f8754c) ? Boolean.FALSE : n3.l.m(Float.valueOf(n3.q.c(qVar3.f8755a)), new n3.s(n3.q.b(qVar3.f8755a)));
            case 11:
                x1.b bVar = (x1.b) obj2;
                return bVar == null ? false : x1.b.b(bVar.f14521a, 9205357640488583168L) ? Boolean.FALSE : n3.l.m(Float.valueOf(Float.intBitsToFloat((int) (bVar.f14521a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & bVar.f14521a))));
            case 12:
                o1.a aVar4 = (o1.a) obj;
                List list2 = ((i3.b) obj2).f6614a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList2.add(f0.a((i3.a) list2.get(i10), f0.f1346t, aVar4));
                }
                return arrayList2;
            case 13:
                return ((i3.a) obj2).f6612a.toLanguageTag();
            case 14:
                m3.i iVar = (m3.i) obj2;
                return n3.l.m(new m3.f(iVar.f8414a), new m3.h(iVar.f8415b), new m3.g());
            case 15:
                o1.a aVar5 = (o1.a) obj;
                f fVar = (f) obj2;
                Object obj3 = fVar.f1324a;
                if (obj3 instanceof v) {
                    jVar = j.f1373a;
                } else if (obj3 instanceof h0) {
                    jVar = j.f1374b;
                } else if (obj3 instanceof t0) {
                    jVar = j.f1375c;
                } else if (obj3 instanceof s0) {
                    jVar = j.f1376d;
                } else if (obj3 instanceof m) {
                    jVar = j.f1377e;
                } else if (obj3 instanceof l) {
                    jVar = j.f1378f;
                } else {
                    if (!(obj3 instanceof k0)) {
                        throw new UnsupportedOperationException();
                    }
                    jVar = j.f1379g;
                }
                switch (jVar.ordinal()) {
                    case 0:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = f0.a((v) obj3, f0.f1334g, aVar5);
                        break;
                    case 1:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = f0.a((h0) obj3, f0.f1335h, aVar5);
                        break;
                    case 2:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = f0.a((t0) obj3, f0.f1330c, aVar5);
                        break;
                    case 3:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = f0.a((s0) obj3, f0.f1331d, aVar5);
                        break;
                    case 4:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = f0.a((m) obj3, f0.f1332e, aVar5);
                        break;
                    case 5:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = f0.a((l) obj3, f0.f1333f, aVar5);
                        break;
                    case 6:
                        i9.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((k0) obj3).f1385a;
                        break;
                    default:
                        throw new cc.s();
                }
                return n3.l.m(jVar, objA, Integer.valueOf(fVar.f1325b), Integer.valueOf(fVar.f1326c), fVar.f1327d);
            case 16:
                l lVar = (l) obj2;
                return n3.l.m(lVar.f1386a, f0.a(lVar.f1387b, f0.f1336i, (o1.a) obj));
            case 17:
                return ((t0) obj2).f1452a;
            case 18:
                return ((s0) obj2).f1448a;
            case 19:
                o1.a aVar6 = (o1.a) obj;
                v vVar = (v) obj2;
                m3.k kVar = new m3.k(vVar.f1453a);
                m3.m mVar2 = new m3.m(vVar.f1454b);
                Object objA2 = f0.a(new n3.q(vVar.f1455c), f0.f1343q, aVar6);
                m3.q qVar4 = vVar.f1456d;
                m3.q qVar5 = m3.q.f8429c;
                Object objA3 = f0.a(qVar4, f0.f1338l, aVar6);
                Object objA4 = f0.a(vVar.f1457e, g0.f1349a, aVar6);
                m3.i iVar2 = vVar.f1458f;
                m3.i iVar3 = m3.i.f8413c;
                return n3.l.m(kVar, mVar2, objA2, objA3, objA4, f0.a(iVar2, f0.f1347u, aVar6), f0.a(new m3.e(vVar.f1459g), g0.f1350b, aVar6), new m3.d(vVar.f1460h), f0.a(vVar.f1461i, g0.f1351c, aVar6));
            case 20:
                o1.a aVar7 = (o1.a) obj;
                h0 h0Var = (h0) obj2;
                y1.q qVar6 = new y1.q(h0Var.f1356a.b());
                e0 e0Var2 = f0.f1342p;
                Object objA5 = f0.a(qVar6, e0Var2, aVar7);
                n3.q qVar7 = new n3.q(h0Var.f1357b);
                e0 e0Var3 = f0.f1343q;
                Object objA6 = f0.a(qVar7, e0Var3, aVar7);
                f3.k kVar2 = h0Var.f1358c;
                f3.k kVar3 = f3.k.f5257b;
                Object objA7 = f0.a(kVar2, f0.f1339m, aVar7);
                f3.i iVar4 = h0Var.f1359d;
                f3.j jVar2 = h0Var.f1360e;
                String str = h0Var.f1362g;
                Object objA8 = f0.a(new n3.q(h0Var.f1363h), e0Var3, aVar7);
                Object objA9 = f0.a(h0Var.f1364i, f0.f1340n, aVar7);
                Object objA10 = f0.a(h0Var.f1365j, f0.k, aVar7);
                i3.b bVar2 = h0Var.k;
                i3.b bVar3 = i3.b.f6613c;
                Object objA11 = f0.a(bVar2, f0.f1345s, aVar7);
                Object objA12 = f0.a(new y1.q(h0Var.f1366l), e0Var2, aVar7);
                Object objA13 = f0.a(h0Var.f1367m, f0.f1337j, aVar7);
                y1.k0 k0Var2 = h0Var.f1368n;
                y1.k0 k0Var3 = y1.k0.f14924d;
                return n3.l.m(objA5, objA6, objA7, iVar4, jVar2, -1, str, objA8, objA9, objA10, objA11, objA12, objA13, f0.a(k0Var2, f0.f1341o, aVar7));
            case 21:
                o1.a aVar8 = (o1.a) obj;
                p0 p0Var = (p0) obj2;
                h0 h0Var2 = p0Var.f1422a;
                u0.k kVar4 = f0.f1335h;
                return n3.l.m(f0.a(h0Var2, kVar4, aVar8), f0.a(p0Var.f1423b, kVar4, aVar8), f0.a(p0Var.f1424c, kVar4, aVar8), f0.a(p0Var.f1425d, kVar4, aVar8));
            case 22:
                Boolean boolValueOf = Boolean.valueOf(((x) obj2).f1465a);
                u0.k kVar5 = f0.f1328a;
                return n3.l.m(boolValueOf, new k());
            case 23:
                return Integer.valueOf(((m3.e) obj2).f8407a);
            case 24:
                m3.s sVar = (m3.s) obj2;
                m3.r rVar = new m3.r(sVar.f8435a);
                u0.k kVar6 = f0.f1328a;
                return n3.l.m(rVar, Boolean.valueOf(sVar.f8436b));
            case 25:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return ((y8.h) obj).s((y8.f) obj2);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return ((y8.h) obj).s((y8.f) obj2);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return Integer.valueOf(Math.round((1 + (((n3.o) obj2) != n3.o.f8749a ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            default:
                f0.u uVar = (f0.u) obj2;
                return n3.l.J(Integer.valueOf(uVar.f4856e.f4839b.f()), Integer.valueOf(uVar.f4856e.f4840c.f()));
        }
    }
}

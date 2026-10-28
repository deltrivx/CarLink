package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements pa.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9791h;

    public i3(Context context) {
        this.f9784a = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9788e = layoutParams;
        this.f9789f = new Rect();
        this.f9790g = new int[2];
        this.f9791h = new int[2];
        this.f9785b = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f9786c = viewInflate;
        this.f9787d = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(i3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public i3(jb.k kVar, i3 i3Var, List list, String str, String str2) {
        Map linkedHashMap;
        this.f9784a = 1;
        i9.l.e(list, "typeParameterProtos");
        i9.l.e(str, "debugName");
        this.f9785b = kVar;
        this.f9786c = i3Var;
        this.f9787d = str;
        this.f9788e = str2;
        jb.i iVar = kVar.f7043a;
        this.f9789f = iVar.f7018a.c(new jb.a0(this, 0));
        this.f9790g = iVar.f7018a.c(new jb.a0(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = u8.x.f13123a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                ra.x0 x0Var = (ra.x0) it.next();
                linkedHashMap.put(Integer.valueOf(x0Var.f12258d), new lb.t((jb.k) this.f9785b, x0Var, i7));
                i7++;
            }
        }
        this.f9791h = linkedHashMap;
    }

    public i3(t tVar, x9.e eVar, wa.b bVar, List list, x9.n0 n0Var) {
        this.f9784a = 2;
        this.f9787d = tVar;
        this.f9788e = eVar;
        this.f9789f = bVar;
        this.f9790g = list;
        this.f9791h = n0Var;
        this.f9785b = tVar;
        this.f9786c = new HashMap();
    }

    public static nb.a0 a(nb.a0 a0Var, nb.w wVar) {
        u9.i iVarL0 = n3.n.l0(a0Var);
        y9.h annotations = a0Var.getAnnotations();
        nb.w wVarH = n4.h.H(a0Var);
        List listE = n4.h.E(a0Var);
        List listI0 = u8.p.i0(n4.h.J(a0Var));
        ArrayList arrayList = new ArrayList(u8.q.a0(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(((nb.n0) it.next()).b());
        }
        return n4.h.y(iVarL0, annotations, wVarH, listE, arrayList, wVar, true).H0(a0Var.E0());
    }

    public static final ArrayList j(ra.s0 s0Var, i3 i3Var) {
        List list = s0Var.f12170d;
        i9.l.d(list, "getArgumentList(...)");
        ra.s0 s0VarJ = n3.r.J(s0Var, ((jb.k) i3Var.f9785b).f7046d);
        Iterable iterableJ = s0VarJ != null ? j(s0VarJ, i3Var) : null;
        if (iterableJ == null) {
            iterableJ = u8.w.f13122a;
        }
        return u8.p.x0(iterableJ, list);
    }

    public static nb.h0 k(List list, y9.h hVar, nb.k0 k0Var, x9.k kVar) {
        nb.h0 h0VarB0;
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((nb.k) it.next()).getClass();
            if (hVar.isEmpty()) {
                nb.h0.f8997b.getClass();
                h0VarB0 = nb.h0.f8998c;
            } else {
                u0.k kVar2 = nb.h0.f8997b;
                List listI = n3.l.I(new nb.g(hVar));
                kVar2.getClass();
                h0VarB0 = u0.k.B0(listI);
            }
            arrayList.add(h0VarB0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u8.u.c0((Iterable) it2.next(), arrayList2);
        }
        nb.h0.f8997b.getClass();
        return u0.k.B0(arrayList2);
    }

    public static final x9.e n(i3 i3Var, ra.s0 s0Var, int i7) {
        jb.k kVar = (jb.k) i3Var.f9785b;
        wa.b bVarD = i2.c.D(kVar.f7044b, i7);
        yb.q qVarS = yb.l.S(yb.l.R(s0Var, new jb.a0(i3Var, 2)), jb.b0.f7004b);
        ArrayList arrayList = new ArrayList();
        Iterator it = qVarS.iterator();
        while (true) {
            yb.p pVar = (yb.p) it;
            if (!pVar.hasNext()) {
                break;
            }
            arrayList.add(pVar.next());
        }
        int iN = yb.l.N(yb.l.R(bVarD, jb.c0.f7006h));
        while (arrayList.size() < iN) {
            arrayList.add(0);
        }
        return kVar.f7043a.f7028l.w(bVarD, arrayList);
    }

    @Override // pa.l
    public void b() {
        t tVar = (t) this.f9787d;
        wa.b bVar = (wa.b) this.f9789f;
        HashMap map = (HashMap) this.f9786c;
        i9.l.e(map, "arguments");
        boolean zT = false;
        if (bVar.equals(t9.a.f12853b)) {
            Object obj = map.get(wa.e.e("value"));
            bb.s sVar = obj instanceof bb.s ? (bb.s) obj : null;
            if (sVar != null) {
                Object obj2 = sVar.f1683a;
                bb.q qVar = obj2 instanceof bb.q ? (bb.q) obj2 : null;
                if (qVar != null) {
                    zT = tVar.t(qVar.f1691a.f1681a);
                }
            }
        }
        if (zT || tVar.t(bVar)) {
            return;
        }
        ((List) this.f9790g).add(new y9.c(((x9.e) this.f9788e).n(), map, (x9.n0) this.f9791h));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public List c() {
        return u8.p.J0(this.f9791h.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public x9.r0 d(int i7) {
        x9.r0 r0Var = (x9.r0) this.f9791h.get(Integer.valueOf(i7));
        if (r0Var != null) {
            return r0Var;
        }
        i3 i3Var = (i3) this.f9786c;
        if (i3Var != null) {
            return i3Var.d(i7);
        }
        return null;
    }

    @Override // pa.l
    public void e(wa.e eVar, bb.f fVar) {
        ((HashMap) this.f9786c).put(eVar, new bb.s(new bb.q(fVar)));
    }

    @Override // pa.l
    public void f(wa.e eVar, wa.b bVar, wa.e eVar2) {
        ((HashMap) this.f9786c).put(eVar, new bb.i(bVar, eVar2));
    }

    @Override // pa.l
    public void g(wa.e eVar, Object obj) {
        ((HashMap) this.f9786c).put(eVar, t.g((t) this.f9785b, eVar, obj));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02af  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:115:0x0300  */
    /* JADX WARN: Code duplicated, block: B:116:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x030f  */
    /* JADX WARN: Code duplicated, block: B:127:0x032c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0331  */
    /* JADX WARN: Code duplicated, block: B:131:0x033d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0365  */
    /* JADX WARN: Code duplicated, block: B:139:0x0368  */
    /* JADX WARN: Code duplicated, block: B:141:0x036b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0370  */
    /* JADX WARN: Code duplicated, block: B:145:0x0379  */
    /* JADX WARN: Code duplicated, block: B:146:0x037e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0384  */
    /* JADX WARN: Code duplicated, block: B:149:0x0390 A[PHI: r4
      0x0390: PHI (r4v10 nb.a0) = (r4v8 nb.a0), (r4v15 nb.a0) binds: [B:153:0x03ab, B:147:0x0382] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0392  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x03db  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:53:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x03ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ae, please report this as an issue */
    public nb.a0 h(ra.s0 s0Var, boolean z10) {
        nb.k0 k0VarD;
        x9.h hVarN;
        Object next;
        int i7;
        nb.h0 h0VarK;
        ArrayList arrayList;
        int i10;
        List listJ0;
        ra.s0 s0VarA;
        nb.a0 a0VarT;
        nb.a0 a0VarP;
        boolean z11;
        int size;
        x9.h hVarL;
        v9.k kVarG;
        nb.n0 n0Var;
        nb.w wVarB;
        x9.h hVarL2;
        wa.c cVarG;
        nb.w wVarB2;
        x9.b bVar;
        wa.c cVarC;
        int size2;
        int i11;
        int i12;
        ra.q0 q0Var;
        x9.r0 r0Var;
        ra.p0 p0Var;
        int iOrdinal;
        nb.x0 x0Var;
        int i13;
        ra.s0 s0VarA2;
        nb.n0 f0Var;
        nb.n0 f0Var2;
        jb.k kVar = (jb.k) this.f9785b;
        aa.f0 f0Var3 = kVar.f7046d;
        jb.i iVar = kVar.f7043a;
        x9.k kVar2 = kVar.f7045c;
        i9.l.e(s0Var, "proto");
        int i14 = s0Var.f12169c;
        if ((i14 & 16) == 16) {
            if (i2.c.D(kVar.f7044b, s0Var.f12175i).f14238c) {
                kVar.f7043a.f7024g.getClass();
            }
        } else if ((i14 & 128) == 128) {
            if (i2.c.D(kVar.f7044b, s0Var.f12177l).f14238c) {
                kVar.f7043a.f7024g.getClass();
            }
        }
        int i15 = s0Var.f12169c;
        if ((i15 & 16) != 16) {
            if ((i15 & 32) == 32) {
                hVarN = d(s0Var.f12176j);
                if (hVarN == null) {
                    pb.l lVar = pb.l.f10415a;
                    k0VarD = pb.l.d(pb.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(s0Var.f12176j), (String) this.f9788e);
                }
            } else if ((i15 & 64) == 64) {
                String string = kVar.f7044b.getString(s0Var.k);
                Iterator it = c().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!i9.l.a(((x9.r0) next).getName().b(), string));
                x9.r0 r0Var2 = (x9.r0) next;
                if (r0Var2 == null) {
                    pb.l lVar2 = pb.l.f10415a;
                    k0VarD = pb.l.d(pb.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, kVar2.toString());
                } else {
                    hVarN = r0Var2;
                }
            } else if ((i15 & 128) == 128) {
                hVarN = (x9.h) ((f1.e) this.f9790g).invoke(Integer.valueOf(s0Var.f12177l));
                if (hVarN == null) {
                    hVarN = n(this, s0Var, s0Var.f12177l);
                }
            } else {
                pb.l lVar3 = pb.l.f10415a;
                k0VarD = pb.l.d(pb.k.UNKNOWN_TYPE, new String[0]);
            }
            i7 = 1;
            if (pb.l.f(k0VarD.l())) {
                pb.l lVar4 = pb.l.f10415a;
                return pb.l.e(pb.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, u8.w.f13122a, k0VarD, (String[]) Arrays.copyOf(new String[]{k0VarD.toString()}, 1));
            }
            lb.a aVar = new lb.a(iVar.f7018a, new aa.j(8, this, s0Var));
            h0VarK = k(iVar.f7034r, aVar, k0VarD, kVar2);
            ArrayList arrayListJ = j(s0Var, this);
            arrayList = new ArrayList(u8.q.a0(arrayListJ, 10));
            i10 = 0;
            for (Object obj : arrayListJ) {
                i12 = i10 + 1;
                if (i10 >= 0) {
                    n3.l.Y();
                    throw null;
                }
                q0Var = (ra.q0) obj;
                List listN = k0VarD.n();
                i9.l.d(listN, "getParameters(...)");
                r0Var = (x9.r0) u8.p.n0(i10, listN);
                p0Var = q0Var.f12137c;
                if (p0Var == ra.p0.STAR) {
                    i9.l.d(p0Var, "getProjection(...)");
                    iOrdinal = p0Var.ordinal();
                    if (iOrdinal != 0) {
                        x0Var = nb.x0.IN_VARIANCE;
                    } else if (iOrdinal != i7) {
                        x0Var = nb.x0.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new cc.s();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + p0Var);
                        }
                        x0Var = nb.x0.INVARIANT;
                    }
                    i13 = q0Var.f12136b;
                    if ((i13 & 2) == 2) {
                        s0VarA2 = q0Var.f12138d;
                    } else if ((i13 & 4) == 4) {
                        s0VarA2 = f0Var3.a(q0Var.f12139e);
                    } else {
                        s0VarA2 = null;
                    }
                    if (s0VarA2 == null) {
                        f0Var2 = new nb.f0(pb.l.c(pb.k.NO_RECORDED_TYPE, q0Var.toString()));
                    } else {
                        f0Var = new nb.f0(l(s0VarA2), x0Var);
                        f0Var2 = f0Var;
                    }
                } else if (r0Var == null) {
                    f0Var2 = new nb.e0(iVar.f7019b.k());
                } else {
                    f0Var = new nb.f0(r0Var);
                    f0Var2 = f0Var;
                }
                arrayList.add(f0Var2);
                i10 = i12;
                i7 = 1;
            }
            listJ0 = u8.p.J0(arrayList);
            x9.h hVarL3 = k0VarD.l();
            if (z10 || !(hVarL3 instanceof x9.q0)) {
                s0VarA = null;
                if (ta.d.f12860a.i(s0Var.f12182q).booleanValue()) {
                    z11 = s0Var.f12171e;
                    size = k0VarD.n().size() - listJ0.size();
                    if (size == 0) {
                        a0VarP = nb.c.t(listJ0, h0VarK, k0VarD, z11);
                        hVarL = a0VarP.D0().l();
                        if (hVarL != null) {
                            kVarG = n4.h.G(hVarL);
                        } else {
                            kVarG = null;
                        }
                        if (i9.l.a(kVarG, v9.g.f13697c) || (n0Var = (nb.n0) u8.p.t0(n4.h.J(a0VarP))) == null || (wVarB = n0Var.b()) == null) {
                            a0VarP = null;
                        } else {
                            hVarL2 = wVarB.D0().l();
                            if (hVarL2 != null) {
                                cVarG = db.e.g(hVarL2);
                            } else {
                                cVarG = null;
                            }
                            if (wVarB.B0().size() == 1 && (i9.l.a(cVarG, u9.o.f13203g) || i9.l.a(cVarG, jb.d0.f7011a))) {
                                wVarB2 = ((nb.n0) u8.p.A0(wVarB.B0())).b();
                                i9.l.d(wVarB2, "getType(...)");
                                if (kVar2 instanceof x9.b) {
                                    bVar = (x9.b) kVar2;
                                } else {
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    cVarC = db.e.c(bVar);
                                } else {
                                    cVarC = null;
                                }
                                if (i9.l.a(cVarC, jb.z.f7091a)) {
                                    a0VarP = a(a0VarP, wVarB2);
                                } else {
                                    a0VarP = a(a0VarP, wVarB2);
                                }
                            }
                        }
                    } else if (size != 1 && (size2 = listJ0.size() - 1) >= 0) {
                        nb.k0 k0VarT = k0VarD.k().w(size2).t();
                        i9.l.d(k0VarT, "getTypeConstructor(...)");
                        a0VarP = nb.c.t(listJ0, h0VarK, k0VarT, z11);
                    } else {
                        a0VarP = null;
                    }
                    if (a0VarP == null) {
                        pb.l lVar5 = pb.l.f10415a;
                        a0VarT = pb.l.e(pb.k.INCONSISTENT_SUSPEND_FUNCTION, listJ0, k0VarD, new String[0]);
                    } else {
                        a0VarT = a0VarP;
                    }
                } else {
                    a0VarT = nb.c.t(listJ0, h0VarK, k0VarD, s0Var.f12171e);
                    if (ta.d.f12861b.i(s0Var.f12182q).booleanValue()) {
                        a0VarP = nb.d.p(a0VarT, true);
                        if (a0VarP == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarT + '\'').toString());
                        }
                        a0VarT = a0VarP;
                    }
                }
            } else {
                x9.q0 q0Var2 = (x9.q0) hVarL3;
                nb.d dVar = new nb.d();
                List listN2 = ((aa.h) q0Var2).f342h.n();
                ArrayList arrayList2 = new ArrayList(u8.q.a0(listN2, 10));
                Iterator it2 = listN2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((x9.r0) it2.next()).a());
                }
                s0VarA = null;
                da.a aVar2 = new da.a(s0VarA, q0Var2, listJ0, u8.b0.Z0(u8.p.O0(arrayList2, listJ0)), 7);
                nb.h0.f8997b.getClass();
                nb.h0 h0Var = nb.h0.f8998c;
                i9.l.e(h0Var, "attributes");
                nb.a0 a0VarI = dVar.i(aVar2, h0Var, false, 0, true);
                List list = iVar.f7034r;
                ArrayList arrayListV0 = u8.p.v0(aVar, a0VarI.getAnnotations());
                a0VarT = a0VarI.H0(nb.u0.e(a0VarI) || s0Var.f12171e).J0(k(list, arrayListV0.isEmpty() ? y9.g.f15129a : new y9.i(0, arrayListV0), k0VarD, kVar2));
            }
            i11 = s0Var.f12169c;
            if ((i11 & 1024) == 1024) {
                s0VarA = s0Var.f12180o;
            } else if ((i11 & 2048) == 2048) {
                s0VarA = f0Var3.a(s0Var.f12181p);
            }
            if (s0VarA != null) {
                return nb.c.E(a0VarT, h(s0VarA, false));
            }
            return a0VarT;
        }
        hVarN = (x9.h) ((f1.e) this.f9789f).invoke(Integer.valueOf(s0Var.f12175i));
        if (hVarN == null) {
            hVarN = n(this, s0Var, s0Var.f12175i);
        }
        k0VarD = hVarN.t();
        i9.l.d(k0VarD, "getTypeConstructor(...)");
        i7 = 1;
        if (pb.l.f(k0VarD.l())) {
            pb.l lVar6 = pb.l.f10415a;
            return pb.l.e(pb.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, u8.w.f13122a, k0VarD, (String[]) Arrays.copyOf(new String[]{k0VarD.toString()}, 1));
        }
        lb.a aVar3 = new lb.a(iVar.f7018a, new aa.j(8, this, s0Var));
        h0VarK = k(iVar.f7034r, aVar3, k0VarD, kVar2);
        ArrayList arrayListJ2 = j(s0Var, this);
        arrayList = new ArrayList(u8.q.a0(arrayListJ2, 10));
        i10 = 0;
        while (r9.hasNext()) {
            i12 = i10 + 1;
            if (i10 >= 0) {
                n3.l.Y();
                throw null;
            }
            q0Var = (ra.q0) obj;
            List listN3 = k0VarD.n();
            i9.l.d(listN3, "getParameters(...)");
            r0Var = (x9.r0) u8.p.n0(i10, listN3);
            p0Var = q0Var.f12137c;
            if (p0Var == ra.p0.STAR) {
                i9.l.d(p0Var, "getProjection(...)");
                iOrdinal = p0Var.ordinal();
                if (iOrdinal != 0) {
                    x0Var = nb.x0.IN_VARIANCE;
                } else if (iOrdinal != i7) {
                    x0Var = nb.x0.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new cc.s();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + p0Var);
                    }
                    x0Var = nb.x0.INVARIANT;
                }
                i13 = q0Var.f12136b;
                if ((i13 & 2) == 2) {
                    s0VarA2 = q0Var.f12138d;
                } else if ((i13 & 4) == 4) {
                    s0VarA2 = f0Var3.a(q0Var.f12139e);
                } else {
                    s0VarA2 = null;
                }
                if (s0VarA2 == null) {
                    f0Var2 = new nb.f0(pb.l.c(pb.k.NO_RECORDED_TYPE, q0Var.toString()));
                } else {
                    f0Var = new nb.f0(l(s0VarA2), x0Var);
                    f0Var2 = f0Var;
                }
            } else if (r0Var == null) {
                f0Var2 = new nb.e0(iVar.f7019b.k());
            } else {
                f0Var = new nb.f0(r0Var);
                f0Var2 = f0Var;
            }
            arrayList.add(f0Var2);
            i10 = i12;
            i7 = 1;
        }
        listJ0 = u8.p.J0(arrayList);
        x9.h hVarL4 = k0VarD.l();
        if (z10) {
            s0VarA = null;
            if (ta.d.f12860a.i(s0Var.f12182q).booleanValue()) {
                z11 = s0Var.f12171e;
                size = k0VarD.n().size() - listJ0.size();
                if (size == 0) {
                    a0VarP = nb.c.t(listJ0, h0VarK, k0VarD, z11);
                    hVarL = a0VarP.D0().l();
                    if (hVarL != null) {
                        kVarG = n4.h.G(hVarL);
                    } else {
                        kVarG = null;
                    }
                    if (i9.l.a(kVarG, v9.g.f13697c)) {
                        a0VarP = null;
                    } else {
                        hVarL2 = wVarB.D0().l();
                        if (hVarL2 != null) {
                            cVarG = db.e.g(hVarL2);
                        } else {
                            cVarG = null;
                        }
                        if (wVarB.B0().size() == 1) {
                            wVarB2 = ((nb.n0) u8.p.A0(wVarB.B0())).b();
                            i9.l.d(wVarB2, "getType(...)");
                            if (kVar2 instanceof x9.b) {
                                bVar = (x9.b) kVar2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                cVarC = db.e.c(bVar);
                            } else {
                                cVarC = null;
                            }
                            if (i9.l.a(cVarC, jb.z.f7091a)) {
                                a0VarP = a(a0VarP, wVarB2);
                            } else {
                                a0VarP = a(a0VarP, wVarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    a0VarP = null;
                } else {
                    nb.k0 k0VarT2 = k0VarD.k().w(size2).t();
                    i9.l.d(k0VarT2, "getTypeConstructor(...)");
                    a0VarP = nb.c.t(listJ0, h0VarK, k0VarT2, z11);
                }
                if (a0VarP == null) {
                    pb.l lVar7 = pb.l.f10415a;
                    a0VarT = pb.l.e(pb.k.INCONSISTENT_SUSPEND_FUNCTION, listJ0, k0VarD, new String[0]);
                } else {
                    a0VarT = a0VarP;
                }
            } else {
                a0VarT = nb.c.t(listJ0, h0VarK, k0VarD, s0Var.f12171e);
                if (ta.d.f12861b.i(s0Var.f12182q).booleanValue()) {
                    a0VarP = nb.d.p(a0VarT, true);
                    if (a0VarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarT + '\'').toString());
                    }
                    a0VarT = a0VarP;
                }
            }
        } else {
            s0VarA = null;
            if (ta.d.f12860a.i(s0Var.f12182q).booleanValue()) {
                z11 = s0Var.f12171e;
                size = k0VarD.n().size() - listJ0.size();
                if (size == 0) {
                    a0VarP = nb.c.t(listJ0, h0VarK, k0VarD, z11);
                    hVarL = a0VarP.D0().l();
                    if (hVarL != null) {
                        kVarG = n4.h.G(hVarL);
                    } else {
                        kVarG = null;
                    }
                    if (i9.l.a(kVarG, v9.g.f13697c)) {
                        a0VarP = null;
                    } else {
                        hVarL2 = wVarB.D0().l();
                        if (hVarL2 != null) {
                            cVarG = db.e.g(hVarL2);
                        } else {
                            cVarG = null;
                        }
                        if (wVarB.B0().size() == 1) {
                            wVarB2 = ((nb.n0) u8.p.A0(wVarB.B0())).b();
                            i9.l.d(wVarB2, "getType(...)");
                            if (kVar2 instanceof x9.b) {
                                bVar = (x9.b) kVar2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                cVarC = db.e.c(bVar);
                            } else {
                                cVarC = null;
                            }
                            if (i9.l.a(cVarC, jb.z.f7091a)) {
                                a0VarP = a(a0VarP, wVarB2);
                            } else {
                                a0VarP = a(a0VarP, wVarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    a0VarP = null;
                } else {
                    nb.k0 k0VarT3 = k0VarD.k().w(size2).t();
                    i9.l.d(k0VarT3, "getTypeConstructor(...)");
                    a0VarP = nb.c.t(listJ0, h0VarK, k0VarT3, z11);
                }
                if (a0VarP == null) {
                    pb.l lVar8 = pb.l.f10415a;
                    a0VarT = pb.l.e(pb.k.INCONSISTENT_SUSPEND_FUNCTION, listJ0, k0VarD, new String[0]);
                } else {
                    a0VarT = a0VarP;
                }
            } else {
                a0VarT = nb.c.t(listJ0, h0VarK, k0VarD, s0Var.f12171e);
                if (ta.d.f12861b.i(s0Var.f12182q).booleanValue()) {
                    a0VarP = nb.d.p(a0VarT, true);
                    if (a0VarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + a0VarT + '\'').toString());
                    }
                    a0VarT = a0VarP;
                }
            }
        }
        i11 = s0Var.f12169c;
        if ((i11 & 1024) == 1024) {
            s0VarA = s0Var.f12180o;
        } else if ((i11 & 2048) == 2048) {
            s0VarA = f0Var3.a(s0Var.f12181p);
        }
        if (s0VarA != null) {
            return nb.c.E(a0VarT, h(s0VarA, false));
        }
        return a0VarT;
    }

    @Override // pa.l
    public pa.l i(wa.b bVar, wa.e eVar) {
        ArrayList arrayList = new ArrayList();
        return new b3.r(((t) this.f9785b).u(bVar, x9.n0.f14716e0, arrayList), this, eVar, arrayList);
    }

    public nb.w l(ra.s0 s0Var) {
        ra.s0 s0VarA;
        jb.k kVar = (jb.k) this.f9785b;
        i9.l.e(s0Var, "proto");
        if ((s0Var.f12169c & 2) != 2) {
            return h(s0Var, true);
        }
        String string = kVar.f7044b.getString(s0Var.f12172f);
        nb.a0 a0VarH = h(s0Var, true);
        aa.f0 f0Var = kVar.f7046d;
        int i7 = s0Var.f12169c;
        if ((i7 & 4) == 4) {
            s0VarA = s0Var.f12173g;
        } else {
            s0VarA = (i7 & 8) == 8 ? f0Var.a(s0Var.f12174h) : null;
        }
        i9.l.b(s0VarA);
        return kVar.f7043a.f7027j.d(s0Var, string, a0VarH, h(s0VarA, true));
    }

    @Override // pa.l
    public pa.m m(wa.e eVar) {
        return new da.a((t) this.f9785b, eVar, this);
    }

    public String toString() {
        String str;
        switch (this.f9784a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f9787d);
                i3 i3Var = (i3) this.f9786c;
                if (i3Var == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) i3Var.f9787d);
                }
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}

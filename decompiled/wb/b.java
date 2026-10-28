package wb;

import aa.a0;
import aa.c0;
import aa.e0;
import aa.h0;
import aa.j0;
import aa.n0;
import aa.p0;
import aa.q0;
import aa.r0;
import aa.y0;
import android.graphics.Region;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import cc.s;
import ga.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import n3.r;
import nb.w;
import o9.u;
import r3.y;
import t8.z;
import u8.p;
import u9.n;
import x9.k0;
import x9.m;
import x9.t;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y, m, z4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14284a;

    public b(int i7) {
        switch (i7) {
            case 1:
                this.f14284a = f1.b.s(Boolean.FALSE);
                break;
            case 3:
                this.f14284a = new Stack();
                break;
            case 6:
                this.f14284a = new Region();
                break;
            default:
                this.f14284a = new HashSet();
                break;
        }
    }

    public /* synthetic */ b(Object obj) {
        this.f14284a = obj;
    }

    @Override // x9.m
    public Object A(y0 y0Var, Object obj) {
        ((ya.g) this.f14284a).c0(y0Var, true, (StringBuilder) obj, true);
        return z.f12851a;
    }

    @Override // x9.m
    public Object C(j0 j0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ya.g gVar = (ya.g) this.f14284a;
        gVar.getClass();
        wa.c cVar = j0Var.f364e;
        sb2.append(gVar.G("package-fragment"));
        wa.d dVar = cVar.f14240a;
        i9.l.e(dVar, "fqName");
        String strM = gVar.m(r.P(wa.d.e(dVar)));
        if (strM.length() > 0) {
            sb2.append(" ");
            sb2.append(strM);
        }
        if (gVar.f15196a.l()) {
            sb2.append(" in ");
            gVar.N(j0Var.l(), sb2, false);
        }
        return z.f12851a;
    }

    @Override // x9.m
    public Object G(r0 r0Var, Object obj) throws IOException {
        f(r0Var, (StringBuilder) obj, "setter");
        return z.f12851a;
    }

    @Override // x9.m
    public Object I(q0 q0Var, Object obj) throws IOException {
        f(q0Var, (StringBuilder) obj, "getter");
        return z.f12851a;
    }

    @Override // x9.m
    public Object M(p0 p0Var, Object obj) throws IOException {
        i9.l.e(p0Var, "descriptor");
        ya.g.l((ya.g) this.f14284a, p0Var, (StringBuilder) obj);
        return z.f12851a;
    }

    @Override // x9.m
    public Object N(c0 c0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ya.g gVar = (ya.g) this.f14284a;
        gVar.getClass();
        wa.c cVar = c0Var.f323d;
        sb2.append(gVar.G("package"));
        wa.d dVar = cVar.f14240a;
        i9.l.e(dVar, "fqName");
        String strM = gVar.m(r.P(wa.d.e(dVar)));
        if (strM.length() > 0) {
            sb2.append(" ");
            sb2.append(strM);
        }
        if (gVar.f15196a.l()) {
            sb2.append(" in context of ");
            gVar.N(c0Var.f322c, sb2, false);
        }
        return z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    @Override // x9.m
    public Object O(aa.m mVar, Object obj) throws IOException {
        boolean z10;
        aa.m mVarP;
        boolean z11 = mVar.D;
        StringBuilder sb2 = (StringBuilder) obj;
        ya.g gVar = (ya.g) this.f14284a;
        gVar.getClass();
        gVar.w(sb2, mVar, null);
        ya.k kVar = gVar.f15196a;
        ya.j jVar = kVar.f15230o;
        u[] uVarArr = ya.k.Y;
        if (((Boolean) jVar.a(kVar, uVarArr[13])).booleanValue() || mVar.y().i() != x.f14748c) {
            o oVarD = mVar.d();
            i9.l.d(oVarD, "getVisibility(...)");
            if (gVar.e0(oVarD, sb2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        gVar.H(sb2, mVar);
        boolean z12 = ((Boolean) kVar.P.a(kVar, uVarArr[40])).booleanValue() || !z11 || z10;
        if (z12) {
            sb2.append(gVar.G("constructor"));
        }
        x9.e eVarO0 = mVar.l();
        i9.l.d(eVarO0, "getContainingDeclaration(...)");
        if (((Boolean) kVar.A.a(kVar, uVarArr[25])).booleanValue()) {
            if (z12) {
                sb2.append(" ");
            }
            gVar.N(eVarO0, sb2, true);
            gVar.a0(sb2, mVar.getTypeParameters(), false);
        }
        List listX = mVar.X();
        i9.l.d(listX, "getValueParameters(...)");
        gVar.d0(sb2, listX, mVar.C());
        if (((Boolean) kVar.f15232q.a(kVar, uVarArr[15])).booleanValue() && !z11 && (mVarP = eVarO0.P()) != null) {
            List listX2 = mVarP.X();
            i9.l.d(listX2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listX2) {
                y0 y0Var = (y0) obj2;
                if (!y0Var.D0() && y0Var.f475j == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(gVar.G("this"));
                sb2.append(p.q0(arrayList, ", ", "(", ")", ya.d.f15186n, 24));
            }
        }
        if (((Boolean) kVar.A.a(kVar, ya.k.Y[25])).booleanValue()) {
            gVar.f0(sb2, mVar.getTypeParameters());
        }
        return z.f12851a;
    }

    @Override // r3.y
    public long a(n3.k kVar, long j5, n3.o oVar, long j10) {
        long j11 = ((n3.j) ((h9.a) this.f14284a).invoke()).f8739a;
        return (((long) n3.l.l(kVar.f8741a + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j5 >> 32), oVar == n3.o.f8749a)) << 32) | (((long) n3.l.l(kVar.f8742b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j5 & 4294967295L), true)) & 4294967295L);
    }

    public void b(xa.d dVar) {
        if (!dVar.o()) {
            if (!(dVar instanceof xa.y)) {
                String strValueOf = String.valueOf(dVar.getClass());
                throw new IllegalArgumentException(ob.a.s(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            xa.y yVar = (xa.y) dVar;
            b(yVar.f14835c);
            b(yVar.f14836d);
            return;
        }
        int size = dVar.size();
        int[] iArr = xa.y.f14833h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i7 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f14284a;
        if (stack.isEmpty() || ((xa.d) stack.peek()).size() >= i7) {
            stack.push(dVar);
            return;
        }
        int i10 = iArr[iBinarySearch];
        xa.d yVar2 = (xa.d) stack.pop();
        while (!stack.isEmpty() && ((xa.d) stack.peek()).size() < i10) {
            yVar2 = new xa.y((xa.d) stack.pop(), yVar2);
        }
        xa.y yVar3 = new xa.y(yVar2, dVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = xa.y.f14833h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, yVar3.f14834b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((xa.d) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                yVar3 = new xa.y((xa.d) stack.pop(), yVar3);
            }
        }
        stack.push(yVar3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b3  */
    public void c(t tVar, StringBuilder sb2) throws IOException {
        String strV;
        boolean z10;
        ya.g gVar = (ya.g) this.f14284a;
        ya.k kVar = gVar.f15196a;
        ya.k kVar2 = gVar.f15196a;
        if (!gVar.p()) {
            ya.j jVar = kVar2.f15223g;
            u[] uVarArr = ya.k.Y;
            if (!((Boolean) jVar.a(kVar2, uVarArr[5])).booleanValue()) {
                List listI0 = tVar.i0();
                i9.l.d(listI0, "getContextReceiverParameters(...)");
                gVar.A(sb2, listI0);
                gVar.w(sb2, tVar, null);
                o oVarD = tVar.d();
                i9.l.d(oVarD, "getVisibility(...)");
                gVar.e0(oVarD, sb2);
                gVar.K(sb2, tVar);
                if (((Boolean) kVar2.T.a(kVar2, uVarArr[44])).booleanValue()) {
                    gVar.I(tVar, sb2);
                }
                gVar.Q(sb2, tVar);
                if (((Boolean) kVar2.T.a(kVar2, uVarArr[44])).booleanValue()) {
                    boolean z11 = false;
                    if (tVar.O()) {
                        Collection collectionM = tVar.m();
                        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
                        Collection collection = collectionM;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((t) it.next()).O()) {
                                        if (!((Boolean) kVar2.O.a(kVar2, ya.k.Y[39])).booleanValue()) {
                                            z10 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (tVar.y0()) {
                        Collection collectionM2 = tVar.m();
                        i9.l.d(collectionM2, "getOverriddenDescriptors(...)");
                        Collection collection2 = collectionM2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((t) it2.next()).y0()) {
                                        if (!((Boolean) kVar2.O.a(kVar2, ya.k.Y[39])).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z11 = true;
                                break;
                            }
                        }
                        z11 = true;
                        break;
                    }
                    gVar.L(sb2, tVar.N(), "tailrec");
                    gVar.L(sb2, tVar.o(), "suspend");
                    gVar.L(sb2, tVar.g(), "inline");
                    gVar.L(sb2, z11, "infix");
                    gVar.L(sb2, z10, "operator");
                } else {
                    gVar.L(sb2, tVar.o(), "suspend");
                }
                gVar.H(sb2, tVar);
                if (gVar.s()) {
                    if (tVar.l0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (tVar.q0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(gVar.G("fun"));
            sb2.append(" ");
            List typeParameters = tVar.getTypeParameters();
            i9.l.d(typeParameters, "getTypeParameters(...)");
            gVar.a0(sb2, typeParameters, true);
            gVar.S(sb2, tVar);
        }
        gVar.N(tVar, sb2, true);
        List listX = tVar.X();
        i9.l.d(listX, "getValueParameters(...)");
        gVar.d0(sb2, listX, tVar.C());
        gVar.T(sb2, tVar);
        w wVarP = tVar.p();
        ya.j jVar2 = kVar.f15227l;
        u[] uVarArr2 = ya.k.Y;
        if (!((Boolean) jVar2.a(kVar, uVarArr2[10])).booleanValue()) {
            if (((Boolean) kVar.k.a(kVar, uVarArr2[9])).booleanValue() || wVarP == null) {
                sb2.append(": ");
                if (wVarP == null) {
                    strV = "[NULL]";
                } else {
                    strV = gVar.V(wVarP);
                }
                sb2.append(strV);
            } else {
                wa.e eVar = u9.i.f13141e;
                if (!u9.i.E(wVarP, n.f13171d)) {
                    sb2.append(": ");
                    if (wVarP == null) {
                        strV = "[NULL]";
                    } else {
                        strV = gVar.V(wVarP);
                    }
                    sb2.append(strV);
                }
            }
        }
        List typeParameters2 = tVar.getTypeParameters();
        i9.l.d(typeParameters2, "getTypeParameters(...)");
        gVar.f0(sb2, typeParameters2);
    }

    @Override // z4.d
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // z4.d
    public void e(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f14284a).setResultCode(i7);
    }

    public void f(n0 n0Var, StringBuilder sb2, String str) throws IOException {
        ya.g gVar = (ya.g) this.f14284a;
        ya.k kVar = gVar.f15196a;
        int iOrdinal = ((ya.p) kVar.H.a(kVar, ya.k.Y[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c(n0Var, sb2);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new s();
                }
                return;
            }
        }
        gVar.I(n0Var, sb2);
        sb2.append(str.concat(" for "));
        k0 k0VarC0 = n0Var.C0();
        i9.l.d(k0VarC0, "getCorrespondingProperty(...)");
        ya.g.l(gVar, k0VarC0, sb2);
    }

    @Override // x9.m
    public Object h(aa.h hVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ya.g gVar = (ya.g) this.f14284a;
        gVar.getClass();
        gVar.w(sb2, hVar, null);
        o oVar = hVar.f340f;
        i9.l.d(oVar, "getVisibility(...)");
        gVar.e0(oVar, sb2);
        gVar.I(hVar, sb2);
        sb2.append(gVar.G("typealias"));
        sb2.append(" ");
        gVar.N(hVar, sb2, true);
        gVar.a0(sb2, hVar.q(), false);
        gVar.y(hVar, sb2);
        sb2.append(" = ");
        sb2.append(gVar.V(((lb.s) hVar).E0()));
        return z.f12851a;
    }

    @Override // x9.m
    public /* bridge */ /* synthetic */ Object l(t tVar, Object obj) throws IOException {
        c(tVar, (StringBuilder) obj);
        return z.f12851a;
    }

    @Override // x9.m
    public Object o(h0 h0Var, Object obj) {
        ((ya.g) this.f14284a).N(h0Var, (StringBuilder) obj, true);
        return z.f12851a;
    }

    @Override // x9.m
    public Object p(a0 a0Var, Object obj) {
        ((StringBuilder) obj).append(a0Var.getName());
        return z.f12851a;
    }

    @Override // x9.m
    public Object w(aa.l lVar, Object obj) {
        ((ya.g) this.f14284a).Y(lVar, (StringBuilder) obj, true);
        return z.f12851a;
    }

    @Override // x9.m
    public Object y(e0 e0Var, Object obj) throws IOException {
        aa.m mVarP;
        String str;
        StringBuilder sb2 = (StringBuilder) obj;
        ya.g gVar = (ya.g) this.f14284a;
        ya.k kVar = gVar.f15196a;
        boolean z10 = e0Var.f() == x9.f.f14704d;
        if (!gVar.p()) {
            List listX0 = e0Var.x0();
            i9.l.d(listX0, "getContextReceivers(...)");
            gVar.A(sb2, listX0);
            gVar.w(sb2, e0Var, null);
            if (!z10) {
                o oVarD = e0Var.d();
                i9.l.d(oVarD, "getVisibility(...)");
                gVar.e0(oVarD, sb2);
            }
            if ((e0Var.f() != x9.f.f14702b || e0Var.i() != x.f14750e) && (!e0Var.f().a() || e0Var.i() != x.f14747b)) {
                x xVarI = e0Var.i();
                i9.l.d(xVarI, "getModality(...)");
                gVar.J(xVarI, sb2, ya.g.t(e0Var));
            }
            gVar.I(e0Var, sb2);
            gVar.L(sb2, gVar.o().contains(ya.h.INNER) && e0Var.H(), "inner");
            gVar.L(sb2, gVar.o().contains(ya.h.DATA) && e0Var.z0(), "data");
            gVar.L(sb2, gVar.o().contains(ya.h.INLINE) && e0Var.g(), "inline");
            gVar.L(sb2, gVar.o().contains(ya.h.VALUE) && e0Var.j(), "value");
            gVar.L(sb2, gVar.o().contains(ya.h.FUN) && e0Var.z(), "fun");
            if (e0Var instanceof x9.q0) {
                str = "typealias";
            } else if (e0Var.u()) {
                str = "companion object";
            } else {
                int iOrdinal = e0Var.f().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new s();
                    }
                    str = "object";
                }
            }
            sb2.append(gVar.G(str));
        }
        if (za.d.l(e0Var)) {
            if (((Boolean) kVar.G.a(kVar, ya.k.Y[31])).booleanValue()) {
                if (gVar.p()) {
                    sb2.append("companion object");
                }
                ya.g.U(sb2);
                x9.k kVarL = e0Var.l();
                if (kVarL != null) {
                    sb2.append("of ");
                    wa.e name = kVarL.getName();
                    i9.l.d(name, "getName(...)");
                    sb2.append(gVar.M(name, false));
                }
            }
            if (gVar.s() || !i9.l.a(e0Var.getName(), wa.g.f14252b)) {
                if (!gVar.p()) {
                    ya.g.U(sb2);
                }
                wa.e name2 = e0Var.getName();
                i9.l.d(name2, "getName(...)");
                sb2.append(gVar.M(name2, true));
            }
        } else {
            if (!gVar.p()) {
                ya.g.U(sb2);
            }
            gVar.N(e0Var, sb2, true);
        }
        if (!z10) {
            List listQ = e0Var.q();
            i9.l.d(listQ, "getDeclaredTypeParameters(...)");
            gVar.a0(sb2, listQ, false);
            gVar.y(e0Var, sb2);
            if (!e0Var.f().a() && ((Boolean) kVar.f15225i.a(kVar, ya.k.Y[7])).booleanValue() && (mVarP = e0Var.P()) != null) {
                sb2.append(" ");
                gVar.w(sb2, mVarP, null);
                aa.m mVar = mVarP;
                o oVarD2 = mVar.d();
                i9.l.d(oVarD2, "getVisibility(...)");
                gVar.e0(oVarD2, sb2);
                sb2.append(gVar.G("constructor"));
                List listX = mVar.X();
                i9.l.d(listX, "getValueParameters(...)");
                gVar.d0(sb2, listX, mVarP.C());
            }
            if (!((Boolean) kVar.f15239x.a(kVar, ya.k.Y[22])).booleanValue() && !u9.i.F(e0Var.n())) {
                Collection collectionM = e0Var.t().m();
                i9.l.d(collectionM, "getSupertypes(...)");
                if (!collectionM.isEmpty() && (collectionM.size() != 1 || !u9.i.y((w) collectionM.iterator().next()))) {
                    ya.g.U(sb2);
                    sb2.append(": ");
                    p.p0(collectionM, sb2, ", ", null, null, new ya.f(gVar, 1), 60);
                }
            }
            gVar.f0(sb2, listQ);
        }
        return z.f12851a;
    }
}

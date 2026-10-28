package w0;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f13873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(t1 t1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f13871a = i7;
        this.f13873c = t1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f13871a) {
            case 0:
                return new o1(this.f13873c, cVar, 0);
            default:
                return new o1(this.f13873c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f13871a) {
            case 0:
                break;
        }
        return ((o1) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        Object d1Var;
        Object hVar;
        CharSequence text;
        Parcel parcel;
        int i7;
        b3.h hVar2;
        int i10 = this.f13871a;
        l0.i0 i0Var = l0.i0.f7678a;
        z8.a aVar = z8.a.f15774a;
        t1 t1Var = this.f13873c;
        t8.z zVar = t8.z.f12851a;
        switch (i10) {
            case 0:
                int i11 = this.f13872b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    if (!b3.q0.c(t1Var.m().f5890b)) {
                        r2.e1 e1Var = t1Var.f13945g;
                        if (e1Var != null) {
                            r2.d1 d1VarA = c0.d.a(a.a.F(t1Var.m()));
                            this.f13872b = 1;
                            ((r2.g) e1Var).a(d1VarA);
                            if (zVar == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return zVar;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                b3.h hVarI = a.a.I(t1Var.m(), t1Var.m().f5889a.f1353b.length());
                b3.h hVarH = a.a.H(t1Var.m(), t1Var.m().f5889a.f1353b.length());
                b3.e eVar = new b3.e(hVarI);
                eVar.a(hVarH);
                b3.h hVarC = eVar.c();
                int iF = b3.q0.f(t1Var.m().f5890b);
                g3.w wVarE = t1.e(hVarC, b3.g0.b(iF, iF));
                t1Var.f13941c.invoke(wVarE);
                t1Var.f13959v = new b3.q0(wVarE.f5890b);
                t1Var.p(i0Var);
                t1Var.f13939a.f7841e = true;
                return zVar;
            default:
                int i12 = this.f13872b;
                if (i12 == 0) {
                    t8.a.e(obj);
                    r2.e1 e1Var2 = t1Var.f13945g;
                    if (e1Var2 != null) {
                        this.f13872b = 1;
                        ClipData primaryClip = ((r2.g) e1Var2).f11234a.f11247a.getPrimaryClip();
                        d1Var = primaryClip != null ? new r2.d1(primaryClip) : null;
                        if (d1Var == aVar) {
                            return aVar;
                        }
                    }
                    return zVar;
                }
                if (i12 == 1) {
                    t8.a.e(obj);
                    d1Var = obj;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    hVar = obj;
                }
                hVar2 = (b3.h) hVar;
                if (hVar2 != null) {
                    b3.e eVar2 = new b3.e(a.a.I(t1Var.m(), t1Var.m().f5889a.f1353b.length()));
                    eVar2.a(hVar2);
                    b3.h hVarC2 = eVar2.c();
                    b3.h hVarH2 = a.a.H(t1Var.m(), t1Var.m().f5889a.f1353b.length());
                    b3.e eVar3 = new b3.e(hVarC2);
                    eVar3.a(hVarH2);
                    b3.h hVarC3 = eVar3.c();
                    int length = hVar2.f1353b.length() + b3.q0.f(t1Var.m().f5890b);
                    g3.w wVarE2 = t1.e(hVarC3, b3.g0.b(length, length));
                    t1Var.f13941c.invoke(wVarE2);
                    t1Var.f13959v = new b3.q0(wVarE2.f5890b);
                    t1Var.p(i0Var);
                    t1Var.f13939a.f7841e = true;
                }
                return zVar;
                r2.d1 d1Var2 = (r2.d1) d1Var;
                if (d1Var2 != null) {
                    this.f13872b = 2;
                    ClipData clipData = d1Var2.f11212a;
                    int i13 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        hVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        i9.l.e(annotationArr, "<this>");
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i14 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i14];
                                if (i9.l.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    c0.a aVar2 = new c0.a();
                                    Parcel parcelObtain = Parcel.obtain();
                                    aVar2.f1798a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i13);
                                    parcelObtain.unmarshall(bArrDecode, i13, bArrDecode.length);
                                    parcelObtain.setDataPosition(i13);
                                    Parcel parcel2 = aVar2.f1798a;
                                    long jA = y1.q.f14958m;
                                    long jA2 = jA;
                                    long jB = n3.q.f8754c;
                                    long jB2 = jB;
                                    f3.k kVar = null;
                                    f3.i iVar = null;
                                    f3.j jVar = null;
                                    String string = null;
                                    m3.a aVar3 = null;
                                    m3.p pVar = null;
                                    m3.l lVar = null;
                                    y1.k0 k0Var = null;
                                    while (parcel2.dataAvail() > 1) {
                                        byte b10 = parcel2.readByte();
                                        if (b10 == 1) {
                                            if (parcel2.dataAvail() >= 8) {
                                                jA = aVar2.a();
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 2) {
                                            if (parcel2.dataAvail() >= 5) {
                                                jB = aVar2.b();
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 3) {
                                            if (parcel2.dataAvail() >= 4) {
                                                kVar = new f3.k(parcel2.readInt());
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 4) {
                                            if (parcel2.dataAvail() >= 1) {
                                                byte b11 = parcel2.readByte();
                                                iVar = new f3.i((b11 != 0 && b11 == 1) ? 1 : 0);
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 5) {
                                            if (parcel2.dataAvail() >= 1) {
                                                byte b12 = parcel2.readByte();
                                                if (b12 == 0) {
                                                    i7 = 0;
                                                } else if (b12 == 1) {
                                                    i7 = 65535;
                                                } else if (b12 == 3) {
                                                    i7 = 2;
                                                } else if (b12 == 2) {
                                                    i7 = 1;
                                                } else {
                                                    i7 = 0;
                                                }
                                                jVar = new f3.j(i7);
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 6) {
                                            string = parcel2.readString();
                                        } else if (b10 == 7) {
                                            if (parcel2.dataAvail() >= 5) {
                                                jB2 = aVar2.b();
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 8) {
                                            if (parcel2.dataAvail() >= 4) {
                                                aVar3 = new m3.a(parcel2.readFloat());
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 9) {
                                            if (parcel2.dataAvail() >= 8) {
                                                pVar = new m3.p(parcel2.readFloat(), parcel2.readFloat());
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 == 10) {
                                            if (parcel2.dataAvail() >= 8) {
                                                jA2 = aVar2.a();
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (b10 != 11) {
                                            parcel = parcel2;
                                            if (b10 != 12) {
                                                parcel2 = parcel;
                                            } else if (parcel.dataAvail() >= 20) {
                                                parcel2 = parcel;
                                                k0Var = new y1.k0(parcel.readFloat(), aVar2.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L));
                                            } else {
                                                arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                            }
                                        } else if (parcel2.dataAvail() >= 4) {
                                            int i15 = parcel2.readInt();
                                            boolean z10 = (i15 & 2) != 0;
                                            boolean z11 = (i15 & 1) != 0;
                                            m3.l lVar2 = m3.l.f8422d;
                                            m3.l lVar3 = m3.l.f8421c;
                                            if (z10 && z11) {
                                                parcel = parcel2;
                                                List listJ = n3.l.J(lVar2, lVar3);
                                                Integer numValueOf = 0;
                                                int size = listJ.size();
                                                for (int i16 = 0; i16 < size; i16++) {
                                                    numValueOf = Integer.valueOf(((m3.l) listJ.get(i16)).f8423a | numValueOf.intValue());
                                                }
                                                lVar = new m3.l(numValueOf.intValue());
                                            } else {
                                                parcel = parcel2;
                                                lVar = z10 ? lVar2 : z11 ? lVar3 : m3.l.f8420b;
                                            }
                                            parcel2 = parcel;
                                        } else {
                                            arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                        }
                                    }
                                    arrayList.add(new b3.f(spanStart, spanEnd, new b3.h0(jA, jB, kVar, iVar, jVar, (f3.n) null, string, jB2, aVar3, pVar, (i3.b) null, jA2, lVar, k0Var, 49152)));
                                }
                                if (i14 != length2) {
                                    i14++;
                                    text = text;
                                    spanned = spanned;
                                    i13 = 0;
                                }
                            }
                        } else {
                            text = text;
                        }
                        hVar = new b3.h(text.toString(), arrayList, 4);
                    } else {
                        hVar = new b3.h(text.toString());
                    }
                    if (hVar == aVar) {
                        return aVar;
                    }
                    hVar2 = (b3.h) hVar;
                    if (hVar2 != null) {
                        b3.e eVar4 = new b3.e(a.a.I(t1Var.m(), t1Var.m().f5889a.f1353b.length()));
                        eVar4.a(hVar2);
                        b3.h hVarC4 = eVar4.c();
                        b3.h hVarH3 = a.a.H(t1Var.m(), t1Var.m().f5889a.f1353b.length());
                        b3.e eVar5 = new b3.e(hVarC4);
                        eVar5.a(hVarH3);
                        b3.h hVarC5 = eVar5.c();
                        int length3 = hVar2.f1353b.length() + b3.q0.f(t1Var.m().f5890b);
                        g3.w wVarE3 = t1.e(hVarC5, b3.g0.b(length3, length3));
                        t1Var.f13941c.invoke(wVarE3);
                        t1Var.f13959v = new b3.q0(wVarE3.f5890b);
                        t1Var.p(i0Var);
                        t1Var.f13939a.f7841e = true;
                    }
                }
                return zVar;
        }
    }
}

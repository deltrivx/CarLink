package w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f14064b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f14065c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f14066d = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.e f14067a = new h1.e(new p[16]);

    public static void b(o oVar) {
        oVar.getClass();
        oVar.a(new l(1, 3));
    }

    public final boolean a(h9.k kVar) {
        if (this == f14064b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f14065c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        h1.e eVar = this.f14067a;
        int i7 = eVar.f6423c;
        if (i7 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = eVar.f6421a;
        boolean z10 = false;
        for (int i10 = 0; i10 < i7; i10++) {
            r1.o oVar = (r1.o) ((p) objArr[i10]);
            if (!oVar.f11117a.f11129n) {
                n2.a.b("visitChildren called on an unattached node");
            }
            h1.e eVar2 = new h1.e(new r1.o[16]);
            r1.o oVar2 = oVar.f11117a;
            r1.o oVar3 = oVar2.f11122f;
            if (oVar3 == null) {
                q2.f.b(eVar2, oVar2);
            } else {
                eVar2.b(oVar3);
            }
            while (true) {
                int i11 = eVar2.f6423c;
                if (i11 == 0) {
                    break;
                }
                r1.o oVarF = (r1.o) eVar2.l(i11 - 1);
                if ((oVarF.f11120d & 1024) == 0) {
                    q2.f.b(eVar2, oVarF);
                } else {
                    while (oVarF != null) {
                        if ((oVarF.f11119c & 1024) != 0) {
                            h1.e eVar3 = null;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    s sVar = (s) oVarF;
                                    if (sVar.B0().f14054a ? ((Boolean) kVar.invoke(sVar)).booleanValue() : f.i(sVar, 7, kVar)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((oVarF.f11119c & 1024) != 0) && (oVarF instanceof q2.m)) {
                                    int i12 = 0;
                                    for (r1.o oVar4 = ((q2.m) oVarF).f10746p; oVar4 != null; oVar4 = oVar4.f11122f) {
                                        if ((oVar4.f11119c & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                oVarF = oVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar3.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar3.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar3);
                            }
                            break;
                        }
                        oVarF = oVarF.f11122f;
                    }
                }
            }
        }
        return z10;
    }
}

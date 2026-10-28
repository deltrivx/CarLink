package j;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6795c;

    public /* synthetic */ g(int i7, int i10, Object obj) {
        this.f6793a = i10;
        this.f6795c = obj;
        this.f6794b = i7;
    }

    public g(int i7, e4.n nVar) {
        this.f6793a = 7;
        this.f6794b = i7;
        this.f6795c = new e4.n[]{nVar};
    }

    public g(int i7, e4.n[] nVarArr) {
        this.f6793a = 2;
        this.f6794b = i7;
        this.f6795c = nVarArr;
    }

    public g(Context context) {
        this.f6793a = 0;
        int iF = h.f(context, 0);
        this.f6795c = new d(new ContextThemeWrapper(context, h.f(context, iF)));
        this.f6794b = iF;
    }

    public g(e4.n nVar, e4.n nVar2) {
        this.f6793a = 7;
        this.f6794b = 62;
        this.f6795c = new e4.n[]{nVar, nVar2};
    }

    public g(oa.r rVar, ja.e eVar) {
        this.f6793a = 6;
        i9.l.e(rVar, "configuration");
        this.f6795c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(g gVar, t8.b bVar, a9.a aVar) {
        rc.q qVar;
        LinkedHashMap linkedHashMap;
        t8.b bVar2;
        byte bF;
        g gVar2;
        ja.e eVar;
        ja.e eVar2 = (ja.e) gVar.f6795c;
        if (aVar instanceof rc.q) {
            qVar = (rc.q) aVar;
            int i7 = qVar.f12349h;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qVar.f12349h = i7 - Integer.MIN_VALUE;
            } else {
                qVar = new rc.q(gVar, aVar);
            }
        } else {
            qVar = new rc.q(gVar, aVar);
        }
        Object obj = qVar.f12347f;
        int i10 = qVar.f12349h;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = qVar.f12346e;
            String str = qVar.f12345d;
            linkedHashMap = qVar.f12344c;
            gVar2 = qVar.f12343b;
            bVar2 = qVar.f12342a;
            t8.a.e(obj);
            linkedHashMap.put(str, (qc.j) obj);
            bF = ((ja.e) gVar2.f6795c).f();
            if (bF == 4) {
                i11 = i12;
                gVar = gVar2;
            } else if (bF != 7) {
                ja.e.n((ja.e) gVar2.f6795c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            eVar = (ja.e) gVar2.f6795c;
            if (bF == 6) {
                eVar.g((byte) 7);
            } else if (bF == 4) {
                rc.j.j(eVar, "object");
                throw null;
            }
            return new qc.u(linkedHashMap);
        }
        t8.a.e(obj);
        byte bG = eVar2.g((byte) 6);
        if (eVar2.q() == 4) {
            ja.e.n(eVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        bVar2 = bVar;
        bF = bG;
        ja.e eVar3 = (ja.e) gVar.f6795c;
        if (!eVar3.c()) {
            gVar2 = gVar;
            eVar = (ja.e) gVar2.f6795c;
            if (bF == 6) {
                eVar.g((byte) 7);
            } else if (bF == 4) {
                rc.j.j(eVar, "object");
                throw null;
            }
            return new qc.u(linkedHashMap);
        }
        String strJ = eVar3.j();
        eVar3.g((byte) 5);
        qVar.f12342a = bVar2;
        qVar.f12343b = gVar;
        qVar.f12344c = linkedHashMap;
        qVar.f12345d = strJ;
        qVar.f12346e = i11;
        qVar.f12349h = 1;
        bVar2.getClass();
        bVar2.f12818b = qVar;
        return z8.a.f15774a;
    }

    public void b(long j5) {
        if (c(j5)) {
            return;
        }
        int i7 = this.f6794b;
        long[] jArrCopyOf = (long[]) this.f6795c;
        if (i7 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i7 + 1, jArrCopyOf.length * 2));
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f6795c = jArrCopyOf;
        }
        jArrCopyOf[i7] = j5;
        if (i7 >= this.f6794b) {
            this.f6794b = i7 + 1;
        }
    }

    public boolean c(long j5) {
        int i7 = this.f6794b;
        for (int i10 = 0; i10 < i7; i10++) {
            if (((long[]) this.f6795c)[i10] == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public h d() {
        d dVar = (d) this.f6795c;
        h hVar = new h(dVar.f6749a, this.f6794b);
        View view = dVar.f6753e;
        f fVar = hVar.f6799f;
        if (view != null) {
            fVar.f6783n = view;
        } else {
            CharSequence charSequence = dVar.f6752d;
            if (charSequence != null) {
                fVar.f6774d = charSequence;
                TextView textView = fVar.f6781l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f6751c;
            if (drawable != null) {
                fVar.f6780j = drawable;
                ImageView imageView = fVar.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.k.setImageDrawable(drawable);
                }
            }
        }
        if (dVar.f6755g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f6750b.inflate(fVar.f6787r, (ViewGroup) null);
            int i7 = dVar.f6757i ? fVar.f6788s : fVar.f6789t;
            Object obj = dVar.f6755g;
            ?? eVar = obj;
            if (obj == null) {
                eVar = new e(dVar.f6749a, i7, R.id.text1, null);
            }
            fVar.f6784o = eVar;
            fVar.f6785p = dVar.f6758j;
            if (dVar.f6756h != null) {
                alertController$RecycleListView.setOnItemClickListener(new c(dVar, fVar));
            }
            if (dVar.f6757i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f6775e = alertController$RecycleListView;
        }
        hVar.setCancelable(true);
        hVar.setCanceledOnTouchOutside(true);
        hVar.setOnCancelListener(null);
        hVar.setOnDismissListener(null);
        o.n nVar = dVar.f6754f;
        if (nVar != null) {
            hVar.setOnKeyListener(nVar);
        }
        return hVar;
    }

    public void e(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = (char[]) this.f6795c;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            i9.l.d(cArrCopyOf, "copyOf(...)");
            this.f6795c = cArrCopyOf;
        }
    }

    public qc.j f() {
        qc.j uVar;
        Object obj;
        ja.e eVar = (ja.e) this.f6795c;
        byte bQ = eVar.q();
        if (bQ == 1) {
            return h(true);
        }
        if (bQ == 0) {
            return h(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return g();
            }
            ja.e.n(eVar, "Cannot read Json element because of unexpected ".concat(rc.j.p(bQ)), 0, null, 6);
            throw null;
        }
        int i7 = this.f6794b + 1;
        this.f6794b = i7;
        if (i7 == 200) {
            rc.p pVar = new rc.p(this, null);
            t8.b bVar = new t8.b();
            bVar.f12817a = pVar;
            bVar.f12818b = bVar;
            z8.a aVar = t8.a.f12814a;
            bVar.f12819c = aVar;
            while (true) {
                obj = bVar.f12819c;
                y8.c cVar = bVar.f12818b;
                if (cVar == null) {
                    break;
                }
                if (i9.l.a(aVar, obj)) {
                    try {
                        rc.p pVar2 = bVar.f12817a;
                        i9.b0.d(3, pVar2);
                        rc.p pVar3 = new rc.p(pVar2.f12341d, cVar);
                        pVar3.f12340c = bVar;
                        Object objInvokeSuspend = pVar3.invokeSuspend(t8.z.f12851a);
                        if (objInvokeSuspend != z8.a.f15774a) {
                            cVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        cVar.resumeWith(t8.a.b(th));
                    }
                } else {
                    bVar.f12819c = aVar;
                    cVar.resumeWith(obj);
                }
            }
            t8.a.e(obj);
            uVar = (qc.j) obj;
        } else {
            byte bG = eVar.g((byte) 6);
            if (eVar.q() == 4) {
                ja.e.n(eVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (eVar.c()) {
                String strJ = eVar.j();
                eVar.g((byte) 5);
                linkedHashMap.put(strJ, f());
                bG = eVar.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    ja.e.n(eVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                eVar.g((byte) 7);
            } else if (bG == 4) {
                rc.j.j(eVar, "object");
                throw null;
            }
            uVar = new qc.u(linkedHashMap);
        }
        this.f6794b--;
        return uVar;
    }

    public qc.d g() {
        ja.e eVar = (ja.e) this.f6795c;
        byte bF = eVar.f();
        if (eVar.q() == 4) {
            ja.e.n(eVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (eVar.c()) {
            arrayList.add(f());
            bF = eVar.f();
            if (bF != 4) {
                boolean z10 = bF == 9;
                int i7 = eVar.f6996b;
                if (!z10) {
                    ja.e.n(eVar, "Expected end of the array or comma", i7, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            eVar.g((byte) 9);
        } else if (bF == 4) {
            rc.j.j(eVar, "array");
            throw null;
        }
        return new qc.d(arrayList);
    }

    public qc.y h(boolean z10) {
        ja.e eVar = (ja.e) this.f6795c;
        String strK = !z10 ? eVar.k() : eVar.j();
        return (z10 || !i9.l.a(strK, "null")) ? new qc.o(strK, z10) : qc.r.INSTANCE;
    }

    public void i() {
        rc.c cVar = rc.c.f12317c;
        char[] cArr = (char[]) this.f6795c;
        cVar.getClass();
        i9.l.e(cArr, "array");
        synchronized (cVar) {
            int i7 = cVar.f4400a;
            if (cArr.length + i7 < rc.b.f12316a) {
                cVar.f4400a = i7 + cArr.length;
                ((u8.k) cVar.f4401b).addLast(cArr);
            }
        }
    }

    public void j(long j5) {
        int i7 = this.f6794b;
        int i10 = 0;
        while (i10 < i7) {
            if (j5 == ((long[]) this.f6795c)[i10]) {
                int i11 = this.f6794b - 1;
                while (i10 < i11) {
                    long[] jArr = (long[]) this.f6795c;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f6794b--;
                return;
            }
            i10++;
        }
    }

    public void k(String str) {
        i9.l.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(this.f6794b, length);
        str.getChars(0, str.length(), (char[]) this.f6795c, this.f6794b);
        this.f6794b += length;
    }

    public String toString() {
        switch (this.f6793a) {
            case 5:
                return new String((char[]) this.f6795c, 0, this.f6794b);
            default:
                return super.toString();
        }
    }
}

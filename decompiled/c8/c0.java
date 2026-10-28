package c8;

import android.content.SharedPreferences;
import b8.n2;
import f1.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2477c;

    public /* synthetic */ c0(p1.p pVar, b1 b1Var, int i7) {
        this.f2475a = i7;
        this.f2476b = pVar;
        this.f2477c = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        Integer num;
        int i7 = this.f2475a;
        t8.z zVar = t8.z.f12851a;
        b1 b1Var = this.f2477c;
        p1.p pVar = this.f2476b;
        switch (i7) {
            case 0:
                p1.v vVar = (p1.v) pVar.iterator();
                if (vVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((n2) vVar.next()).f1623a);
                    while (vVar.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((n2) vVar.next()).f1623a);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                int iIntValue = num != null ? num.intValue() : -1;
                u8.w wVar = u8.w.f13122a;
                b1Var.setValue(new n2(iIntValue + 1, "", wVar, wVar, true));
                break;
            default:
                t8.o oVar = n8.d.f8898a;
                Set setM0 = u8.p.M0(pVar);
                ArrayList arrayList = new ArrayList(u8.q.a0(setM0, 10));
                Iterator it = setM0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                Set<String> setM1 = u8.p.M0(arrayList);
                SharedPreferences sharedPreferencesC = n8.d.c();
                i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
                SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                editorEdit.putStringSet("CONNECT_USB_DEVICE_IGNORE", setM1);
                editorEdit.apply();
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return zVar;
    }
}

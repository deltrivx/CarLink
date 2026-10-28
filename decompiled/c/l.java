package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1745a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1746b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1747c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1748d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1749e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1750f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1751g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p4.l f1752h;

    public l(p4.l lVar) {
        this.f1752h = lVar;
    }

    public final boolean a(int i7, int i10, Intent intent) {
        String str = (String) this.f1745a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        f.b bVar = (f.b) this.f1749e.get(str);
        if ((bVar != null ? bVar.f4741a : null) != null) {
            ArrayList arrayList = this.f1748d;
            if (arrayList.contains(str)) {
                bVar.f4741a.a(bVar.f4742b.H(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1750f.remove(str);
        this.f1751g.putParcelable(str, new f.a(intent, i10));
        return true;
    }

    public final void b(int i7, k9.a aVar, Object obj) {
        Bundle bundleExtra;
        int i10;
        p4.l lVar = this.f1752h;
        f4.e eVarY = aVar.y(lVar, obj);
        if (eVarY != null) {
            new Handler(Looper.getMainLooper()).post(new k(i7, 0, this, eVarY));
            return;
        }
        Intent intentQ = aVar.q(lVar, obj);
        if (intentQ.getExtras() != null) {
            Bundle extras = intentQ.getExtras();
            i9.l.b(extras);
            if (extras.getClassLoader() == null) {
                intentQ.setExtrasClassLoader(lVar.getClassLoader());
            }
        }
        if (intentQ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentQ.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentQ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentQ.getAction())) {
            String[] stringArrayExtra = intentQ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            u3.f.h(lVar, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentQ.getAction())) {
            lVar.startActivityForResult(intentQ, i7, bundle);
            return;
        }
        f.d dVar = (f.d) intentQ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i9.l.b(dVar);
            i10 = i7;
            try {
                lVar.startIntentSenderForResult(dVar.f4744a, i10, dVar.f4745b, dVar.f4746c, dVar.f4747d, 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                new Handler(Looper.getMainLooper()).post(new k(i10, 1, this, e));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i10 = i7;
        }
    }

    public final a2.b c(String str, k9.a aVar, p4.p pVar) {
        Object parcelable;
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        i9.l.e(str, "key");
        LinkedHashMap linkedHashMap2 = this.f1746b;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            Iterator it = ((yb.a) yb.l.Q(f.c.f4743a)).iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number = (Number) it.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.f1745a;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.f1749e.put(str, new f.b(pVar, aVar));
        LinkedHashMap linkedHashMap3 = this.f1750f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            pVar.a(obj);
        }
        int i7 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1751g;
        if (i7 >= 34) {
            parcelable = a4.a.b(str, bundle);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!f.a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        f.a aVar2 = (f.a) parcelable;
        if (aVar2 != null) {
            bundle.remove(str);
            pVar.a(aVar.H(aVar2.f4740b, aVar2.f4739a));
        }
        return new a2.b(this, str, aVar, 5);
    }
}

package g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f.d;
import f4.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p4.u;
import u3.f;
import u8.b0;
import u8.c0;
import u8.l;
import u8.p;
import u8.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5621c;

    public /* synthetic */ a(int i7) {
        this.f5621c = i7;
    }

    @Override // k9.a
    public final Object H(Intent intent, int i7) {
        switch (this.f5621c) {
            case 0:
                if (i7 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        return b0.Z0(p.O0(l.v0(stringArrayExtra), arrayList));
                    }
                }
                return x.f13123a;
            case 1:
                return new f.a(intent, i7);
            default:
                return new f.a(intent, i7);
        }
    }

    @Override // k9.a
    public final Intent q(p4.l lVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f5621c) {
            case 0:
                String[] strArr = (String[]) obj;
                i9.l.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                i9.l.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 1:
                Intent intent = (Intent) obj;
                i9.l.e(intent, "input");
                return intent;
            default:
                d dVar = (d) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = dVar.f4745b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        dVar = new d(dVar.f4744a, null, dVar.f4746c, dVar.f4747d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", dVar);
                if (u.D(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // k9.a
    public e y(p4.l lVar, Object obj) {
        switch (this.f5621c) {
            case 0:
                String[] strArr = (String[]) obj;
                i9.l.e(strArr, "input");
                if (strArr.length == 0) {
                    return new e(x.f13123a);
                }
                for (String str : strArr) {
                    if (f.a(lVar, str) != 0) {
                        return null;
                    }
                }
                int iS0 = c0.S0(strArr.length);
                if (iS0 < 16) {
                    iS0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new e(linkedHashMap);
            default:
                return super.y(lVar, obj);
        }
    }
}

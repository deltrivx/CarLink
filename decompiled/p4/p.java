package p4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f10221b;

    public /* synthetic */ p(u uVar, int i7) {
        this.f10220a = i7;
        this.f10221b = uVar;
    }

    public final void a(Object obj) {
        switch (this.f10220a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                u uVar = this.f10221b;
                t tVar = (t) uVar.C.pollFirst();
                if (tVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = tVar.f10226a;
                    int i10 = tVar.f10227b;
                    i iVarQ = uVar.f10230c.q(str);
                    if (iVarQ == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        ((t6.a) iVarQ).f().e(i10);
                    }
                }
                break;
            case 1:
                f.a aVar = (f.a) obj;
                u uVar2 = this.f10221b;
                t tVar2 = (t) uVar2.C.pollFirst();
                if (tVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = tVar2.f10226a;
                    int i11 = tVar2.f10227b;
                    i iVarQ2 = uVar2.f10230c.q(str2);
                    if (iVarQ2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        iVarQ2.o(i11, aVar.f4739a, aVar.f4740b);
                    }
                }
                break;
            default:
                f.a aVar2 = (f.a) obj;
                u uVar3 = this.f10221b;
                t tVar3 = (t) uVar3.C.pollFirst();
                if (tVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = tVar3.f10226a;
                    int i12 = tVar3.f10227b;
                    i iVarQ3 = uVar3.f10230c.q(str3);
                    if (iVarQ3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        iVarQ3.o(i12, aVar2.f4739a, aVar2.f4740b);
                    }
                }
                break;
        }
    }
}

package c;

import android.content.Intent;
import android.content.IntentSender;
import z.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1743d;

    public /* synthetic */ k(int i7, int i10, Object obj, Object obj2) {
        this.f1740a = i10;
        this.f1741b = obj;
        this.f1742c = i7;
        this.f1743d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1740a) {
            case 0:
                l lVar = (l) this.f1741b;
                Object obj = ((f4.e) this.f1743d).f5285a;
                String str = (String) lVar.f1745a.get(Integer.valueOf(this.f1742c));
                if (str != null) {
                    f.b bVar = (f.b) lVar.f1749e.get(str);
                    if ((bVar != null ? bVar.f4741a : null) != null) {
                        p4.p pVar = bVar.f4741a;
                        if (lVar.f1748d.remove(str)) {
                            pVar.a(obj);
                        }
                    } else {
                        lVar.f1751g.remove(str);
                        lVar.f1750f.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                ((l) this.f1741b).a(this.f1742c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1743d));
                break;
            default:
                ((z4.d) ((w0) this.f1741b).f15574c).e(this.f1742c, this.f1743d);
                break;
        }
    }
}

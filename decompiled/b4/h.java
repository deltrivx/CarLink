package b4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1492e;

    public /* synthetic */ h(String str, Context context, Object obj, int i7, int i10) {
        this.f1488a = i10;
        this.f1489b = str;
        this.f1490c = context;
        this.f1492e = obj;
        this.f1491d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i7 = this.f1488a;
        int i10 = this.f1491d;
        Object obj = this.f1492e;
        Context context = this.f1490c;
        String str = this.f1489b;
        switch (i7) {
            case 0:
                Object[] objArr = {(g) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return k.b(str, context, Collections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return k.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new j(-3);
                }
        }
    }
}

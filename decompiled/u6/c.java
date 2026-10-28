package u6;

import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f13072a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Random f13073b = new Random();

    public static synchronized int a(int i7) {
        int iNextInt;
        while (true) {
            int i10 = i7 > 20000 ? i7 - 10000 : i7 / 2;
            iNextInt = f13073b.nextInt(i7 - i10) + i10;
            if (iNextInt != 1025) {
                ArrayList arrayList = f13072a;
                if (!arrayList.contains(Integer.valueOf(iNextInt))) {
                    arrayList.add(Integer.valueOf(iNextInt));
                }
            }
        }
        return iNextInt;
    }
}

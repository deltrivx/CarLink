package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.baidu.carlife.sdk.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4605c;

    public q(f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f4603a = b1Var;
        this.f4604b = b1Var2;
        this.f4605c = b1Var3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object next;
        Set<String> setKeySet;
        Object obj;
        String string;
        i9.l.e(intent, "intent");
        String action = intent.getAction();
        if (action == null || !action.equals(((l8.j0) this.f4603a.getValue()).f8197b.b())) {
            return;
        }
        int intExtra = intent.getIntExtra("KEY_TYPE", -1);
        int iA = ((l8.j0) this.f4604b.getValue()).f8197b.a();
        if (iA == 0 || intExtra == iA) {
            s.f4612c.getClass();
            Iterator it = s.f4614e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((s) next).f4616b != intExtra);
            s sVar = (s) next;
            ArrayList arrayListL = n3.l.L(new l8.j0(sVar != null ? sVar.f4615a : "未知状态", new l8.m0(String.valueOf(intExtra)), null, null, null, 28));
            Bundle extras = intent.getExtras();
            if (extras != null && (setKeySet = extras.keySet()) != null) {
                for (String str : setKeySet) {
                    Bundle extras2 = intent.getExtras();
                    String strR0 = (extras2 == null || (obj = extras2.get(str)) == null || (string = obj.toString()) == null) ? null : zb.j.R0(10, string);
                    Logger.INSTANCE.d("CarLife_Vehicle", "【高德广播】接收到: " + str + "=" + strR0);
                    i9.l.b(str);
                    arrayListL.add(new l8.j0(str, new l8.m0(String.valueOf(strR0)), null, null, null, 28));
                }
            }
            this.f4605c.setValue(arrayListL);
        }
    }
}

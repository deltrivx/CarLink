package m0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import b3.q0;
import h9.q;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    @Override // h9.q
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        long j5 = ((q0) obj5).f1430a;
        String string = ((CharSequence) obj4).subSequence(q0.f(j5), q0.e(j5)).toString();
        Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
        ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
        Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((Context) obj).startActivity(className);
        return z.f12851a;
    }
}

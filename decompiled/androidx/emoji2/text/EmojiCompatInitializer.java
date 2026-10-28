package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import d5.a;
import d5.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l0.o0;
import l4.j;
import l4.k;
import l4.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // d5.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // d5.b
    public final Object b(Context context) {
        s sVar = new s(new o0(context));
        sVar.f8039b = 1;
        if (j.k == null) {
            synchronized (j.f8003j) {
                try {
                    if (j.k == null) {
                        j.k = new j(sVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f3768e) {
            try {
                objB = aVarC.f3769a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v vVarG = ((t) objB).g();
        vVarG.a(new k(this, vVarG));
    }
}

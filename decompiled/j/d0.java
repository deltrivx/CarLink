package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f6761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f6762d;

    public d0(View view, String str) {
        this.f6759a = view;
        this.f6760b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f6761c != null) {
            break;
        }
        View view2 = this.f6759a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f6760b;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f6761c = method;
                    this.f6762d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f6761c.invoke(this.f6762d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}

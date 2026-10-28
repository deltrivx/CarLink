package l4;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8046b;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f8046b = new ArrayList();
        k9.a.l(cls, "watcherClass cannot be null");
        this.f8045a = cls;
    }

    public v(Class cls, v vVar, int i7, int i10) {
        super(vVar, i7, i10);
        this.f8046b = new ArrayList();
        k9.a.l(cls, "watcherClass cannot be null");
        this.f8045a = cls;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8046b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i7)).f8044b.incrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    public final void b() {
        e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8046b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
            i7++;
        }
    }

    public final u c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8046b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i7);
            if (uVar.f8043a == obj) {
                return uVar;
            }
            i7++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f8045a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8046b;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i7)).f8044b.decrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        if (this.f8045a != cls) {
            return super.getSpans(i7, i10, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i7, i10, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            objArr[i11] = uVarArr[i11].f8043a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        if (cls == null || this.f8045a == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVarC;
        if (d(obj)) {
            uVarC = c(obj);
            if (uVarC != null) {
                obj = uVarC;
            }
        } else {
            uVarC = null;
        }
        super.removeSpan(obj);
        if (uVarC != null) {
            this.f8046b.remove(uVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence) {
        replace(i7, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i7, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence) {
        a();
        super.replace(i7, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i7, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f8046b.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i7, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return new v(this.f8045a, this, i7, i10);
    }
}

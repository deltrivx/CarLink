package n4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f8775b;

    public d(TextView textView) {
        this.f8774a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f8774a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = l4.j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i10);
                }
                return l4.j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        l4.j jVarA = l4.j.a();
        if (this.f8775b == null) {
            this.f8775b = new c(textView, this);
        }
        jVarA.h(this.f8775b);
        return charSequence;
    }
}

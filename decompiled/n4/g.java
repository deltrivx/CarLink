package n4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f8780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8781e;

    public g(TextView textView) {
        super(0);
        this.f8779c = textView;
        this.f8781e = true;
        this.f8780d = new d(textView);
    }

    @Override // n4.h
    public final InputFilter[] F(InputFilter[] inputFilterArr) {
        if (!this.f8781e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f8780d;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // n4.h
    public final void e0(boolean z10) {
        if (z10) {
            j0();
        }
    }

    @Override // n4.h
    public final void f0(boolean z10) {
        this.f8781e = z10;
        j0();
        TextView textView = this.f8779c;
        textView.setFilters(F(textView.getFilters()));
    }

    public final void j0() {
        TextView textView = this.f8779c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f8781e) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f8789a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}

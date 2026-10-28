package w0;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lc.c f13912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f13913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f13914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CharSequence f13918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f13919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j5, CharSequence charSequence, t tVar, y8.c cVar) {
        super(2, cVar);
        this.f13918g = charSequence;
        this.f13919h = j5;
        this.f13920i = tVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        s sVar = new s(this.f13919h, this.f13918g, this.f13920i, cVar);
        sVar.f13917f = obj;
        return sVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create(s1.i.k(obj), (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t tVar;
        long j5;
        lc.c cVar;
        TextSelection textSelectionL;
        CharSequence charSequence;
        int i7 = this.f13916e;
        if (i7 == 0) {
            t8.a.e(obj);
            TextClassifier textClassifierK = s1.i.k(this.f13917f);
            n8.e.y();
            long j10 = this.f13919h;
            int iF = b3.q0.f(j10);
            int iE = b3.q0.e(j10);
            CharSequence charSequence2 = this.f13918g;
            TextSelection.Request.Builder builderK = n8.e.k(charSequence2, iF, iE);
            tVar = this.f13920i;
            TextSelection.Request.Builder defaultLocales = builderK.setDefaultLocales(tVar.b());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierK.suggestSelection(defaultLocales.build());
            long jB = b3.g0.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            z8.a aVar = z8.a.f15774a;
            if (i10 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f13915d = jB;
                this.f13916e = 2;
                if (t.a(tVar, this.f13918g, jB, textClassifierK, this) != aVar) {
                    j5 = jB;
                }
            } else {
                cVar = tVar.f13931e;
                this.f13917f = textSelectionSuggestSelection;
                this.f13912a = cVar;
                this.f13913b = tVar;
                this.f13914c = charSequence2;
                this.f13915d = jB;
                this.f13916e = 1;
                if (cVar.d(this) != aVar) {
                    textSelectionL = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    j5 = jB;
                    TextClassification textClassification = textSelectionL.getTextClassification();
                    i9.l.b(textClassification);
                    tVar.f13933g.setValue(new i1(charSequence, j5, textClassification));
                }
            }
            return aVar;
        }
        if (i7 == 1) {
            j5 = this.f13915d;
            charSequence = this.f13914c;
            tVar = this.f13913b;
            cVar = this.f13912a;
            textSelectionL = s1.i.l(this.f13917f);
            t8.a.e(obj);
            try {
                TextClassification textClassification2 = textSelectionL.getTextClassification();
                i9.l.b(textClassification2);
                tVar.f13933g.setValue(new i1(charSequence, j5, textClassification2));
            } finally {
                cVar.f(null);
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.f13915d;
            t8.a.e(obj);
        }
        return new b3.q0(j5);
    }
}

package com.android.samples.donuttracker;

/**
 * The adapter used by the RecyclerView to display the current list of donuts
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/samples/donuttracker/DonutListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/android/samples/donuttracker/Donut;", "Lcom/android/samples/donuttracker/DonutListAdapter$DonutListViewHolder;", "onEdit", "Lkotlin/Function1;", "", "onDelete", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DonutListViewHolder", "app_debug"})
public final class DonutListAdapter extends androidx.recyclerview.widget.ListAdapter<com.android.samples.donuttracker.Donut, com.android.samples.donuttracker.DonutListAdapter.DonutListViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onEdit;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onDelete;
    
    public DonutListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onEdit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onDelete) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.android.samples.donuttracker.DonutListAdapter.DonutListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.samples.donuttracker.DonutListAdapter.DonutListViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/android/samples/donuttracker/DonutListAdapter$DonutListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/android/samples/donuttracker/databinding/DonutItemBinding;", "onEdit", "Lkotlin/Function1;", "Lcom/android/samples/donuttracker/Donut;", "", "onDelete", "(Lcom/android/samples/donuttracker/databinding/DonutItemBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "description", "Landroid/widget/TextView;", "donut", "donutId", "", "nameView", "rating", "thumbnail", "Landroid/widget/ImageView;", "bind", "app_debug"})
    public static final class DonutListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.android.samples.donuttracker.databinding.DonutItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onEdit;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onDelete;
        private long donutId = -1L;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView nameView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView thumbnail;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView rating;
        @org.jetbrains.annotations.Nullable()
        private com.android.samples.donuttracker.Donut donut;
        
        public DonutListViewHolder(@org.jetbrains.annotations.NotNull()
        com.android.samples.donuttracker.databinding.DonutItemBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onEdit, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.android.samples.donuttracker.Donut, kotlin.Unit> onDelete) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.android.samples.donuttracker.Donut donut) {
        }
    }
}
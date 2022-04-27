package com.example.lightdemotwo;

        import android.graphics.RectF;
        import android.graphics.Shader;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * <p>
 * 创建时间：2021-08-12   1:00
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public interface OnBorderShader {
    /**
     * 创建边框渐变样式
     *
     * @param rectF 高亮控件边框范围
     * @return {@link Shader} 子类对象
     */
    Shader createShader(RectF rectF);
}

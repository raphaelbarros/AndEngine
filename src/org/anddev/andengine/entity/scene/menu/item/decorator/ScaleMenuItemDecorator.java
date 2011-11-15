package org.anddev.andengine.entity.scene.menu.item.decorator;

import org.anddev.andengine.entity.scene.menu.item.IMenuItem;
import org.anddev.andengine.opengl.vbo.IVertexBufferObject;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 15:04:29 - 18.11.2010
 */
public class ScaleMenuItemDecorator<V extends IVertexBufferObject> extends BaseMenuItemDecorator<V> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final float mSelectedScale;
	private final float mUnselectedScale;

	// ===========================================================
	// Constructors
	// ===========================================================

	public ScaleMenuItemDecorator(final IMenuItem<V> pMenuItem, final float pSelectedScale, final float pUnselectedScale) {
		super(pMenuItem);

		this.mSelectedScale = pSelectedScale;
		this.mUnselectedScale = pUnselectedScale;

		pMenuItem.setScale(pUnselectedScale);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public void onMenuItemSelected(final IMenuItem<V> pMenuItem) {
		this.setScale(this.mSelectedScale);
	}

	@Override
	public void onMenuItemUnselected(final IMenuItem<V> pMenuItem) {
		this.setScale(this.mUnselectedScale);
	}

	@Override
	public void onMenuItemReset(final IMenuItem<V> pMenuItem) {
		this.setScale(this.mUnselectedScale);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}

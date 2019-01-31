package thelianuniverse.main.client.gui;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.client.gui.GuiPageButtonList;

public abstract class GuiTUPageList extends GuiTUPageDelegate {

    public GuiTUPageList(int width, int height, int top, int bottom, int slotHeight, int pageNumber) {

        super(width, height, top, bottom, slotHeight, pageNumber);
    }



    @SideOnly(Side.CLIENT)
    public interface GuiResponder extends GuiPageButtonList.GuiResponder
    {
        void handleEnumSelection(int fieldId, int ordinal);

        void handleBooleanSelection(int fieldId, boolean value);

        void handleFloatSelection(int fieldId, float value);

        void handleStringSelection(int fieldId, String value);

        void handleIntSelection(int fieldId, int value);

    }
}

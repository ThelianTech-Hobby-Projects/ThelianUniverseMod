package thelianuniverse.main.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSlot;

public abstract class GuiTUPageDelegate extends GuiSlot {

    public final int pageNumber;

    public GuiTUPageDelegate(int width, int height, int top, int bottom, int slotHeight, int pageNumber) {

        super(Minecraft.getMinecraft(), width, height, top, bottom, slotHeight);

        this.pageNumber = pageNumber;
    }

    public abstract void setup();

    public abstract void setVisible(boolean isVisible);

    public void mouseClicked(int mouseX, int mouseY, int mouseEvent) {
    }

    public void mouseReleased(int mouseX, int mouseY, int state) {}
    public void keyTyped(char typedChar, int keyCode) {

    }

    public Gui getFocusedGuiElement() {

        return null;
    }

    public Gui getGui(int fieldId) {

        return null;
    }
}

package basiccomponents.common.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemIngot extends ItemBase {

   public ItemIngot(String name) {
      super(name);
      this.setCreativeTab(CreativeTabs.tabMaterials);
   }
}

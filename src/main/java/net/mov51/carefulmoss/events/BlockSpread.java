package net.mov51.carefulmoss.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFertilizeEvent;

public class BlockSpread implements Listener {
    @EventHandler
    public void onBlockSpread(BlockFertilizeEvent event){
        if(event.getPlayer() !=null && event.getPlayer().isSneaking()){
            event.getBlocks().removeIf(block ->
                    block.getType() == Material.GRASS||
                            block.getType() == Material.TALL_GRASS||
                            block.getType() == Material.MOSS_CARPET||
                            block.getType() == Material.FLOWERING_AZALEA||
                            block.getType() == Material.AZALEA);

        }
    }
}

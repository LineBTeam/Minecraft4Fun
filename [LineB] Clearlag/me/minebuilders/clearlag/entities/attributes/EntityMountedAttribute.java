/*    */ package me.minebuilders.clearlag.entities.attributes;
/*    */ 
/*    */ import org.bukkit.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityMountedAttribute
/*    */   extends EntityAttribute<Entity>
/*    */ {
/*    */   public boolean containsData(Entity entity)
/*    */   {
/* 12 */     return (!this.reversed) == entity.isEmpty();
/*    */   }
/*    */ }


/* Location:              D:\MINECRAFT_PRONTO\Clearlag.jar!\me\minebuilders\clearlag\entities\attributes\EntityMountedAttribute.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */
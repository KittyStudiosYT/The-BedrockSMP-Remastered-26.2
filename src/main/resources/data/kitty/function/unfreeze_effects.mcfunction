# Plays a glass shattering / ticking sound ONLY to the player who unfreezes the mob
execute at @s run playsound minecraft:block.glass.break player @s ~ ~ ~ 1.0 1.5
execute at @s run playsound minecraft:block.copper_bulb.turn_on player @s ~ ~ ~ 1.0 1.0

# Spawns rapid, energetic copper or trial sparkles around the unfrozen mob to simulate time resuming
execute at @s anchored eyes facing entity @e[nbt={AgeLocked:0b},distance=..5,limit=1,sort=nearest] feet run particle minecraft:small_flame ^ ^ ^3 0.3 0.3 0.3 0.1 20
execute at @s anchored eyes facing entity @e[nbt={AgeLocked:0b},distance=..5,limit=1,sort=nearest] feet run particle minecraft:dust_plume ^ ^ ^3 0.2 0.4 0.2 0.02 10

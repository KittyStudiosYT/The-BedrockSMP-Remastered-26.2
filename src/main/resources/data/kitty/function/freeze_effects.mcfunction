# 1. Play the magical sounding cue to the advancing player
execute at @s run playsound minecraft:block.enchantment_table.use player @s ~ ~ ~ 1.0 1.2

# 2. Safely find the nearest baby mob within 5 blocks and burst sculk souls from it
execute at @s as @e[nbt={AgeLocked:1b},distance=..5,limit=1,sort=nearest] at @s run particle minecraft:sculk_soul ~ ~0.5 ~ 0.2 0.3 0.2 0.05 20

# 3. Burst green/yellow happy villager sparkles from that same locked baby mob
execute at @s as @e[nbt={AgeLocked:1b},distance=..5,limit=1,sort=nearest] at @s run particle minecraft:happy_villager ~ ~0.5 ~ 0.4 0.3 0.4 0.1 15

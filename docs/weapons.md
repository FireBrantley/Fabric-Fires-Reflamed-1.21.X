# Weapons

Fire's Reflamed adds **Swords** and a new weapon type — **Bats** — for multiple material tiers.

---

## Swords

Standard sword items for Titanium, Steel, and Ruby. Crafted with the vanilla sword pattern (two material items + stick).

| Sword | Material | Attack Damage | Attack Speed |
|---|---|---|---|
| Titanium Sword | Titanium Ingot | 14.0 (base 10 + 4) | Fast (-2.4) |
| Steel Sword | Steel Ingot | 6.0 (base 10 + -4) | Fast (-2.4) |
| Ruby Sword | Ruby Gem | 5.0 (base 10 + -5) | Fast (-2.4) |

> Attack damage is calculated as: `material attack damage bonus + per-item bonus + base 1`.

**Crafting (all swords):**
```
_I_
_I_
_S_
```
(I = material item, S = Stick)

---

## Bats

Bats are a unique weapon type exclusive to this mod. They are melee weapons similar to swords but with different damage/speed trade-offs per material. A **Wooden Bat** is also available as an early-game option.

| Bat | Material | Base Dmg Modifier | Attack Speed | Repair Item |
|---|---|---|---|---|
| Wooden Bat | Wood (Stick) | +5 | Slow (-2.9) | — |
| Steel Bat | Steel Ingot | -2 | Slow (-2.8) | Steel Ingot |
| Ruby Bat | Ruby Gem | +0 | Medium (-2.7) | Ruby Gem |
| Titanium Bat | Titanium Ingot | +2 | Medium (-2.6) | Titanium Ingot |

> Final attack damage = tool material's attack damage + bat's individual modifier + 1.

**Crafting — Bat Recipe (all bats follow this pattern):**

```
M M
MMM
_S_
```
Where:
- `M` = material block (e.g. Block of Titanium for Titanium Bat, any Log for Wooden Bat)
- `S` = material ingot/item (e.g. Titanium Ingot, Steel Ingot, Ruby Gem, or Stick for Wooden Bat)

**Wooden Bat specifics:**
- Top row uses any log block
- Bottom material is a Stick

**Tips:**
- Bats are not stackable (max count: 1)
- They can be enchanted and repaired on an anvil with their respective material

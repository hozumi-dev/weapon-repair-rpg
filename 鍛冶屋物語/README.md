# 武器管理システム(Javaポートフォリオ)
## この作品はポートフォリオ用に開発中です。

## プロジェクト概要
Javaで作成。
武器の使用、修理を管理するシステム。
プレイヤーのレベルによって武器の耐久度、攻撃力が変化します。
プレイヤーのレベルは、戦闘能力（体力・攻撃力・防御力）には影響せず、武器の使用頻度や修理スキルの向上にのみ関係します。
それぞれ乱数によって変化あり。

### Player
- name: String
- repairSkillLevel: int
- repairWeapon(Weapon weapon): void

### Weapon
- name: String
- attackPower :int
- durability: int
- maxDurability: int
- isBroken: boolean
- use(): void
- repair(int skillLevel) :void

## 実装予定
- 武器の状態表示
- 武器の破損チェック
- 修理スキルで回復量が変わる修理処理

# キャラクター設定一覧

## ロルフ（チュートリアルの主人公）
- ドワーフの修理工
- 英雄（武器）と共に戦い、呪いを受けた。
- チュートリアル後は消息不明

## 古代の斧（動物モデル：未定）
- ロルフと共に戦った両手斧
- リーチの長さに見合わない攻撃力の高さと素早さを持っている

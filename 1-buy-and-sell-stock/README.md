# Лучшее время для покупки и продажи акций

Вам дан массив prices с ценами `prices[i]` на акции в день `i`th

Вы хотите максимизировать свою прибыль, выбрав один день для покупки акций и другой день в будущем для их продажи.

Верните максимальную прибыль, которую вы можете получить от этой сделки.
Если вы не можете получить никакой прибыли, верните 0.

<hr />

**Пример 1:**

**Input:** prices = [7,1,5,3,6,4]
<br/>
**Output:** 5

> **Объяснение:** купите на второй день (price = 1) и продайте на пятый день (price = 6), прибыль = 6-1 = 5.
>
> Обратите внимание, что покупка на второй день и продажа на первый день недопустимы, потому что вы должны купить до продажи.

<hr />

**Пример 2:**

**Input:** prices = [7,6,4,3,1]
<br/>
**Output:** 0

> **Объяснение:** В этом случае сделки не проводятся и максимальная прибыль = 0.

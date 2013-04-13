# Exercise

An open API of common bodybuilding and weightlifting exercises.

There is a shortage of good quality APIs for fitness apps. You are free to use this API in your own projects

+ Name Exercise name
+ Type Compound or Simple
+ Group Chest, Back etc
+ Equipment Barbell, bodyweight etc


# All exercises

```
GET /api/exercises.json
```

# Search by muscle group


```
GET /api/group/chest
```

# Exercises by equipment

```
GET /api/equipment/bodyweight
```

# Example API call

```scala

import exercise._

```
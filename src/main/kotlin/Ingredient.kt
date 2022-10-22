abstract class Ingredient {

    var nitrogen = 0.0
    var bulkDensity = 0.0

}

abstract class SolidIngredient : Ingredient() {

    var phosphorus = 0.0
    var potassium = 0.0
    var sulphur = 0.0

}

abstract class  LiquidIngredient : Ingredient() {

}

abstract class Fortification : Ingredient() {

}

abstract class Compost : SolidIngredient() {

}

class GLSC : Compost() {

}

class FLSC : Compost() {

}

abstract class Manure : SolidIngredient() {

}

class Broiler : Manure() {

}

class Breeder : Manure() {

}

class LCE : LiquidIngredient() {

}



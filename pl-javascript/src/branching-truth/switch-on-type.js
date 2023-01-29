const Types = {
    TypeA: 0,
    TypeB: 1,
    TypeC: 2,
}

function switchOnTypesAndPrint(aType) {
    switch (true) {
        case (aType === Types.TypeA):
            console.log("Type A")
            break;
        case (aType === Types.TypeB):
            console.log("Type B")
            break;
        case (aType === Types.TypeC):
            console.log("Type C")
            break;
        default:
            console.log("Type Unknown")
    }
}

switchOnTypesAndPrint(Types.TypeA);
switchOnTypesAndPrint(Types.TypeB);
switchOnTypesAndPrint(Types.TypeC);
switchOnTypesAndPrint('');

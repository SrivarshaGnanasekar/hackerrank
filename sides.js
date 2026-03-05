function sides(literals, ...expressions) {
    const area = expressions[0];
    const perimeter = expressions[1];
    
    const halfP = perimeter / 2;
    const discriminant = Math.sqrt((halfP * halfP) - (4 * area));
    
    const s1 = (halfP + discriminant) / 2;
    const s2 = (halfP - discriminant) / 2;
    
    return [s1, s2].sort((a, b) => a - b);
}

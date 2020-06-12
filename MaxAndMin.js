function solution(s) {
    const number = s.split(' ');
    return Math.min(...number)+' '+Math.max(...number);
    
}
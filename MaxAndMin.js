function solution(s) {
    const number = s.split(' ');
    var numberarray = number.map(number => number*1);
    var max = Math.max(...numberarray)+'';
    var min = Math.min(...numberarray)+'';
    var answer = min+' '+max;
    return answer;
}
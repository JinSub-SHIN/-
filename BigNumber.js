function solution(numbers) {
	var answer = numbers.map(array => array+'').sort((n1,n2) => (n2+n1) - (n1+n2)).join('');
	return answer[0] === '0' ? '0' : answer;
}
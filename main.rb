def sieve_of_eratosthenes
    n = 10000005
    prime = Array.new(n + 1, true)
    p = 2
    while p * p <= n
      if prime[p]
        (p * p).step(n, p) { |i| prime[i] = false }
      end
      p += 1
    end
  
    primes = []
    2.upto(n) { |i| primes << i if prime[i] }
    primes
  end
  
  if __FILE__ == $0
    primes = sieve_of_eratosthenes
    puts "5000th prime number is #{primes[4999]}"
  end
document.addEventListener('DOMContentLoaded', function () {
  // Get the elements
  const movableDiv = document.getElementById('movable-div');
  const signUpButton = document.getElementById('sign-up');
  const signInButton = document.getElementById('sign-in');
  const child1 = document.getElementById('chiled1'); // First child
  const child2 = document.getElementById('chiled2'); // Second child
  const parentDiv = document.getElementById('parent-div'); // Parent container

  // Ensure `movableDiv` and children have absolute positioning
  movableDiv.style.position = 'absolute';
  child1.style.position = 'absolute';
  child2.style.position = 'absolute';

  // Utility function to position child2 on the right side of parent-div
  const positionChild2 = () => {
    const parentWidth = parentDiv.offsetWidth;
    const child2Width = child2.offsetWidth;

    child2.style.left = `${parentWidth - child2Width - 450}px`; // 20px margin from the edge
    child2.style.top = '50%'; // Vertically centered
    child2.style.transform = 'translateY(-50%)'; // Adjust for centering
  };

  // Click event for Sign Up button
  signUpButton.addEventListener('click', () => {
    // Move `movableDiv` to the right
    movableDiv.style.left = '450px';
2
    // Show child1 and hide child2
    child1.classList.remove('hidden');
    child2.classList.add('hidden');
  });

  // Click event for Sign In button
  signInButton.addEventListener('click', () => {
    // Move `movableDiv` to the left
    movableDiv.style.left = '0px';

    // Position child2 on the right side of parent-div
    positionChild2();

    // Show child2 and hide child1
    child2.classList.remove('hidden');
    child1.classList.add('hidden');
  });

  // Position child2 initially (to ensure proper placement on load)
  positionChild2();
});
console.log("hiiiiiiiiiiiiii");